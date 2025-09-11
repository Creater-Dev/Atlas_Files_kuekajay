import java.util.Scanner;
public class Task006 { // class Task006 - a program to take input from the user and display it to the user
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        
        System.out.print("Enter your loginID: "); // Prompt user for login ID
        String Id = scanner.nextLine(); // Read the login ID input
        
        System.out.print("Enter your password: "); // Prompt user for password
        String Pwd = scanner.nextLine(); // Read the password input
        
        String maskedPwd = "*".repeat(Pwd.length()); // Mask the password with asterisks
        
        // Display the login ID and masked password
        System.out.println("Hi,"); //Greeting the user
        System.out.println("\tYour loginID is: " + Id); // Display the login ID
        System.out.println("And your password is: " + maskedPwd); // Display the masked password
        
        scanner.close(); // Close the scanner to free up resources
    }
} // end of class Task006
