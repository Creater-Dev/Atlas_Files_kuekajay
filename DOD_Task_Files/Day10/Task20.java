// Write a program to read one byte at a time from a file and copy it into another  file immediately. 
import java.io.*;

class Task20 {
    public static void main(String args[]) {
        try (FileInputStream infile = new FileInputStream("FileName01.txt");
             FileOutputStream outfile = new FileOutputStream("FileName05.txt")) {

            int b; // Read as int to check EOF correctly
            while ((b = infile.read()) != -1) {
                outfile.write(b);
            }

            System.out.println("Byte copied from FileName01.txt to FileName05.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
