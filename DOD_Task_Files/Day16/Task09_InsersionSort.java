public class Task09_InsersionSort {

    // Method to perform Insertion Sort
    public void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];         // Current element to insert
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Place the key in its correct position
        }
    }

    // Method to print array
    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Task09_InsersionSort sorter = new Task09_InsersionSort();
        int[] list = {29, 10, 14, 37, 13};

        System.out.print("Original List: ");
        sorter.printArray(list);

        sorter.insertionSort(list);

        System.out.print("Sorted List:   ");
        sorter.printArray(list);
    }
}
