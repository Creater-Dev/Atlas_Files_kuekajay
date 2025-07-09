//Reverse a string .. write a code.
//Hint: take a name from the user and display the name in reverse order..
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            String reversedName = reverseString(name);
            System.out.println("Reversed name: " + reversedName);
        }
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}