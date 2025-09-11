import java.util.*;

public class Task07_RadixSort {

    // Function to get the number of digits in the maximum number
    static int getMaxDigits(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return Integer.toString(max).length();
    }

    // Function to normalize all numbers to have the same length using leading zeros
    static String[] normalizeNumbers(int[] arr, int maxDigits) {
        String[] normalized = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            normalized[i] = String.format("%0" + maxDigits + "d", arr[i]);
        }
        return normalized;
    }

    // Radix sort using string and buckets
    static String[] radixSort(int[] arr) {
        int maxDigits = getMaxDigits(arr);
        String[] strArr = normalizeNumbers(arr, maxDigits);

        // Process each digit from right to left
        for (int pos = maxDigits - 1; pos >= 0; pos--) {
            // Buckets for digits 0 to 9
            List<List<String>> buckets = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                buckets.add(new ArrayList<>());
            }

            // Distribute numbers into buckets based on current digit
            for (String num : strArr) {
                int digit = Character.getNumericValue(num.charAt(pos));
                buckets.get(digit).add(num);
            }

            // Reconstruct the array from buckets
            int index = 0;
            for (List<String> bucket : buckets) {
                for (String num : bucket) {
                    strArr[index++] = num;
                }
            }
        }

        return strArr; // Return string array with leading zeros
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String[] sortedWithLeadingZeros = radixSort(arr);

        System.out.println("Sorted array (with leading zeros):");
        for (String num : sortedWithLeadingZeros) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
