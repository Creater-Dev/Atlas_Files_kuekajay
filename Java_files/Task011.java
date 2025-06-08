import java.util.Scanner; // Importing Scanner class for user input

public class Task011 { /* Class Task011 - Wap to check loginid and password validation
Hint use while loop */
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        String correctLoginId = "kuekajay"; // Correct login ID
        String correctPwd = "12345"; // Correct password
        int count = 0; // Initialize attempt counter

        System.out.println("Enter your login ID: "); // Prompt for login ID
        String loginId = sc.nextLine(); // Read the login ID
        System.out.println("Enter your password: "); // Prompt for password
        String pwd = sc.nextLine(); // Read the password    

        while(loginId.equals(correctLoginId) && pwd.equals(correctPwd)) { // Check if login ID and password are correct
            System.out.println("Login successful!"); // Print success message
            System.out.println("You logged in for " + ++count + " times"); // number of times logged in

            System.out.println("Enter your login ID: "); // Prompt for login ID
            loginId = sc.nextLine(); // Read the login ID
            System.out.println("Enter your password: "); // Prompt for password
            pwd = sc.nextLine(); // Read the password  
        } // If login ID and password are incorrect
        System.out.println("Invalid login credentials. Login attemt stopped"); // Print error message
        sc.close(); // Close the Scanner object
    } // End of main method
} // End of class Task011
