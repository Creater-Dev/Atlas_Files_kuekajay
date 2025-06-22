// Write a program to merge two files in third file. 
import java.io.*;

class Task21 {
    public static void main(String args[]) {
        try {
            FileInputStream file1 = new FileInputStream("FileName01.txt");
            FileInputStream file2 = new FileInputStream("FileName02.txt");
            FileOutputStream file3 = new FileOutputStream("MergedFile.txt");

            SequenceInputStream sis = new SequenceInputStream(file1, file2);
            BufferedInputStream bis = new BufferedInputStream(sis);
            BufferedOutputStream bos = new BufferedOutputStream(file3);

            int ch;
            while ((ch = bis.read()) != -1) {
                bos.write(ch);
            }

            bis.close();
            bos.close();
            file1.close();
            file2.close();
            file3.close();

            System.out.println("Merged Two Files Successfully");
        } catch (IOException e) {
            System.out.println("Sorry...!! Files Not Found");
        }
    }
}
