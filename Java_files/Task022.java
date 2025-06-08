// Java program to illustrate creating an array
// of integers,  puts some values in the array,
// and prints each value to standard output.

public class Task022 {
    public static void main(String[] args) {
        // Declating an Array
        int[] arr;
        //allocating memory for 5 integers
        arr = new int[5];
        //initialize the elements of the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // accessing the elements of the Specified Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }   // end of for loop
    }   // end of main method
}// end of class Task022
