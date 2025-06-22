import java.io.*;
import java.util.*;

public class Task17 {
    public static void main(String args[]) {
        // Accepting user input from Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to write into file:");
        String s = sc.nextLine();
        sc.close(); // Closing Scanner object

        byte b1[] = s.getBytes();

        // File writing with try-with-resources
        try (FileOutputStream outfile = new FileOutputStream("in.txt")) {
            outfile.write(b1);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            System.exit(-1);
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}