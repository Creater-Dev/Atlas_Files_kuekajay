import java.io.*;

public class Task15 {
    public static void main(String args[]) {
        File f1 = new File("FileName01.txt"); // to create new file
        FileOutputStream outfile = null;
        byte Text[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

        try {
            outfile = new FileOutputStream(f1);
            outfile.write(Text);
            outfile.close(); // Always close the stream after writing
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
// This code creates a file named "FileName01.txt" and writes the string "I LOVE INDIA" into it as bytes.