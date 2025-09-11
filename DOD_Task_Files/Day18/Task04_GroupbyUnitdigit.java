import java.util.Scanner;

public class Task04_GroupbyUnitdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[9];
        System.out.println("Enter 9 numbers:");
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        // Arrays for grouping based on unit digits
        int[] array1 = new int[input.length]; // ends with 0
        int[] array2 = new int[input.length]; // ends with 1
        int[] array3 = new int[input.length]; // ends with 5
        int a1 = 0, a2 = 0, a3 = 0;

        // Categorize numbers by last digit
        for (int num : input) {
            int unit = num % 10;
            if (unit == 0) {
                array1[a1++] = num;
            } else if (unit == 1) {
                array2[a2++] = num;
            } else if (unit == 5) {
                array3[a3++] = num;
            }
        }

        // Display results
        System.out.print("Array 1 digits ends with 0 : ");
        for (int i = 0; i < a1; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.print("Array 2 digits ends with 1 : ");
        for (int i = 0; i < a2; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        System.out.print("Array 3 digits ends with 5 : ");
        for (int i = 0; i < a3; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
