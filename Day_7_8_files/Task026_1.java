//declaring and initializing the array
//Traverse the Multidimensional Array using for loop.
 //int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

public class Task026_1 {
    public static void main(String[] args) {
        //declaring and initializing the array
        int[][] arr = {
            {2, 7, 9},
            {3, 6, 1},
            {7, 4, 2}
        }; // 2D array with 3 rows and 3 columns
        // Traverse the Multidimensional Array using for loop
        for (int i = 0; i < arr.length; i++) { // Loop through each row
            for (int j = 0; j < arr[i].length; j++) { // Loop through each column in the row
                System.out.print(arr[i][j] + " "); // Print the element at row i and column j
            }
            System.out.println(); // Print a new line after each row
        }
    }
}
