import java.util.Scanner; // Importing Scanner class for user input

public class Task008 { // Class Task008 - Wap to check the greater of 2 numbers
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        System.out.print("Enter first number: "); // Prompt for first number
        int num1 = sc.nextInt(); // Read first number

        System.out.print("Enter second number: "); // Prompt for second number
        int num2 = sc.nextInt(); // Read second number

        if (num1 > num2) { // Check if first number is greater
            System.out.println("The greater number is: " + num1); // Print first number if greater
        } else { // Check if second number is greater
            System.out.println("The greater number is: " + num2); // Print second number if greater
        }
        sc.close(); // Close the scanner to prevent resource leaks  
    } // End of main method   
} // End of class Task008
