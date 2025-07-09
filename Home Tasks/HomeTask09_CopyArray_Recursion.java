public class HomeTask09_CopyArray_Recursion {

    // Recursive function to copy array
    public static void copyArray(int[] source, int[] destination, int index) {
        if (index >= source.length) {
            return; // base case: end of array
        }
        destination[index] = source[index]; // copy element
        copyArray(source, destination, index + 1); // recursive call
    }

    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[source.length];

        copyArray(source, destination, 0);

        // Display copied array
        System.out.print("Copied Array: ");
        for (int num : destination) {
            System.out.print(num + " ");
        }
    }
}
