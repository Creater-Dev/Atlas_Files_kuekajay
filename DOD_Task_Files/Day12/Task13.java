//Wap to create  a hash map and display them..
// Step 1: Import required classes
import java.util.HashMap;
import java.util.Map;

public class Task13 {
    public static void main(String[] args) {

        // Step 2: Create a HashMap to store names and marks
        HashMap<Integer, String> studentMarks = new HashMap<>();

        // Step 3: Add key-value pairs using put()
        studentMarks.put(1, "Ajay");
        studentMarks.put(2, "Vijay");
        studentMarks.put(3, "Rahul");

        // Step 4: Display all entries using a loop
        System.out.println("Student Marks:");
        for (Map.Entry<Integer, String> entry : studentMarks.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}
