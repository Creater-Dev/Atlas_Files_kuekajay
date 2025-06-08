import java.util.Scanner; // Importing Scanner class for user input

public class Task012 { /* Class Task012- Wap to check loginid and password validation
    Hint use do while loop*/
    
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        String correctLoginId = "kuekajay"; // Correct login ID
        String correctPwd = "12345"; // Correct password
        int count = 0;
        String loginId, pwd; // Declare loginId and pwd variables

        do { // Start of do-while loop
            System.out.println("You have logged in for " + count++ + " times"); // Print number of times logged in
            System.out.println("Enter your login ID: "); // Prompt for login ID
            loginId = sc.nextLine(); // Read the login ID
            System.out.println("Enter your password: "); // Prompt for password
            pwd = sc.nextLine(); // Read the password
        } while(loginId.equals(correctLoginId) && pwd.equals(correctPwd)); // Check if login ID and password are correct

        System.out.println("Invalid login credentials. Login attempt stopped"); // Print error message
        sc.close(); // Close the Scanner object
    } // End of main method
} // End of class Task012
