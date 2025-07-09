public class HomeTask_Array_RecursionSearch {

    // Recursive function to search for a key in the array
    public static int search(int[] arr, int index, int key) {
        if (index >= arr.length) {
            return -1; // base case: not found
        }
        if (arr[index] == key) {
            return index; // base case: found
        }
        return search(arr, index + 1, key); // recursive step
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        int result = search(arr, 0, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}
