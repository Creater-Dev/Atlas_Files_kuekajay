public class Task021 { // Class Task021- to initialize an array
    //Traverse it using a for loop to print each element. 
    public static void main(String[] args) { // Main method to run the program
        // Initialize an array with 5 elements
        int[] arr = {1,2,3,4,5};
        //size of the array
        int size = arr.length; // Get the size of the array
         // Traverse the array using a for loop
        System.out.println("Output using Print:");
        for (int i = 0; i < size; i++) { 
            System.out.print(arr[i] + " "); 
        } // End of for loop  

        System.out.println("\nOutput using Println:"); 

        for (int i = 0; i < size; i++) { 
            System.out.println(arr[i] + " "); 
        } // End of for loop
    } // End of main method
} // End of class Task021
