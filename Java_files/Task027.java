// Java program to demonstrate
// passing of array to method

public class Task027 { // Class Task027 - Demonstrating passing of array to method
   // Driver method
   public static void main(String args[]) 
   {
       int arr[] = { 3, 1, 2, 5, 4 }; // Declaring and initializing the array
       // passing array to method m1
       sum(arr);
   }
   public static void sum(int[] arr) 
   {
       // getting sum of array values
       int sum = 0;
       for (int i = 0; i < arr.length; i++)
           sum += arr[i];
       System.out.println("sum of array values : " + sum);
   }
}
