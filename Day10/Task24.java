import java.io.FileReader;
import java.io.IOException;

public class Task24 {  //non buffered file reading example
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("largefile.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
