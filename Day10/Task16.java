import java.io.*;

public class Task16 {
    public static void main(String args[]) {
        try (FileInputStream infile = new FileInputStream("FileName01.txt")) {
            int b;
            while ((b = infile.read()) != -1) {
                System.out.print((char) b); // Changed to print instead of println for better formatting
            }
            System.out.println(); // Ensure proper line break after output
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
