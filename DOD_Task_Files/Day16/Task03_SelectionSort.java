public class Task03_SelectionSort {

    // Method to perform selection sort
    public void selectionSort(int[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) { // Outer loop for each position in the array
            int minIndex = i;
            int minValue = A[i];

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) { // Inner loop to find the minimum element
                if (A[j] < minValue) {
                    minIndex = j;
                    minValue = A[j];
                }
            }

            // Swap A[minIndex] and A[i]
            A[minIndex] = A[i]; 
            A[i] = minValue;
        }
    }

    // Method to print array
    public void printArray(int[] A) {
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Task03_SelectionSort sorter = new Task03_SelectionSort();
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original Array: ");
        sorter.printArray(arr);

        sorter.selectionSort(arr);

        System.out.print("Sorted Array: ");
        sorter.printArray(arr);
    }
}
