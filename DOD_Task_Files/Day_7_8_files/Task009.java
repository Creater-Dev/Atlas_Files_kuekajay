import java.util.Scanner; // Importing Scanner class for user input

public class Task009 { // Class Task009- Wap to check greater of 3 numbers 
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Enter 3 numbers: "); // Prompt for 3 numbers
        int num1 = sc.nextInt(); // Read first number
        int num2 = sc.nextInt(); // Read second number  
        int num3 = sc.nextInt(); // Read third number

        if (num1 > num2 && num1 >num3) { // Check if num1 is greater than both num2 and num3
            System.out.println(num1 + " is the greatest number."); // Print result
        } else if (num2 > num1 && num2 > num3) { // Check if num2 is greater than both num1 and num3
            System.out.println(num2 + " is the greatest number."); // Print result
        } else if (num3 > num1 && num3 > num2) { // Check if num3 is greater than both num1 and num2
            System.out.println(num3 + " is the greatest number."); // Print result
        } else {
            System.out.println("All numbers are equal or there is no single greatest number.");
        } // End of main method
        sc.close(); // Close the Scanner object to prevent resource leaks
    } //End of main method
}// End of class Task009
