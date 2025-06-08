import java.util.Scanner; // Importing Scanner class for user input

public class Task010 { // Class Task010- Wap to check if check week days
    public static void main(String[] args) { // Main method
        Scanner sc = new java.util.Scanner(System.in); // Create a Scanner object for input
        System.out.println("Enter a number (1-7): "); // Prompt for a number
        int day = sc.nextInt(); // Read the number

        switch (day) { // Switch statement to check the day
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        } // End of switch statement

        sc.close(); // Close the Scanner object to prevent resource leaks
    } // End of main method
} // End of class Task010
