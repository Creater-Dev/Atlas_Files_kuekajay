// Java program to demonstrate
// return of array from method
public class Task028 {
   // Driver method
   public static void main(String args[]) // Main method to execute the program

   {
       int arr[] = m1(); // Calling the method m1() which returns an array
       // Printing the elements of the array
       for (int i = 0; i < arr.length; i++)
           System.out.print(arr[i] + " ");
   }
   public static int[] m1() // Method m1() that returns an array of integers
   {
       // returning  array
       return new int[] { 1, 2, 3 }; 
   } // End of method m1
} // End of class Task028
