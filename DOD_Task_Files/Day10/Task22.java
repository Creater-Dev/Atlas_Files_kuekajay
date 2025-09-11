import java.io.*;

class Task22 {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java Task22 <old filename> <new filename>");
            return;
        }

        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        // Attempt to rename the file
        if (f1.renameTo(f2)) {
            System.out.println("Renamed file \"" + f1.getName() + "\" to \"" + f2.getName() + "\" successfully.");
        } else {
            System.out.println("Failed to rename file \"" + f1.getName() + "\".");
        }
    }
}