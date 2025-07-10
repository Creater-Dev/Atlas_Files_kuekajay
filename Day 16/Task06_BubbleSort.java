public class Task06_BubbleSort {

    // Method that follows the pseudocode for Bubble Sort
    public void bubbleSort(int[] A) {
        int n = A.length;

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    // Swap A[j] and A[j + 1]
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public void printArray(int[] A) {
        for (int value : A) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Task06_BubbleSort sorter = new Task06_BubbleSort();

        int[] A = { 8, 4, 2, 9, 5 };

        System.out.print("Original List: ");
        sorter.printArray(A);

        sorter.bubbleSort(A);

        System.out.print("Sorted List: ");
        sorter.printArray(A);
    }
}
