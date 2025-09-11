import java.io.*;

public class Task18 {
    public static void main(String args[]) {
        File f1 = new File("FileName03.txt");
        FileWriter fw = null;

        try {
            fw = new FileWriter(f1);
            fw.write("ahmedabad\n");
            fw.write("baroda\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Write operation done!!");
    }
}
