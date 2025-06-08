// Java program to demonstrate
// cloning of one-dimensional arrays

public class Task029 { // Class Task029 - Demonstrating cloning of one-dimensional arrays
    public static void main(String[] args) {
        // Creating and initializing an array
        int intArray[] = {1, 2, 3};
        // Cloning the array
        int clonedArray[] = intArray.clone();
        // Printing the original and cloned arrays
        System.out.println(intArray==clonedArray); // This will print false as they are different objects
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(clonedArray[i] + " "); // Printing the elements of the cloned array
        }
    } // End of main method
} // End of class Task029