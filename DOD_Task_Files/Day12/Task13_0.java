//Wap to create  a hash map and display them..
import java.util.HashMap;

public class Task13_0 {
    public static void main(String[] args) {

        // HashMap 1: Student IDs and Names
        HashMap<Integer, String> studentNames = new HashMap<>();
        studentNames.put(1, "Ajay");
        studentNames.put(2, "Vijay");
        studentNames.put(3, "Rahul");

        // HashMap 2: Student IDs and Marks
        HashMap<Integer, Integer> studentMarks = new HashMap<>(); // studentMarks is the object of HashMap class
        studentMarks.put(1, 90);
        studentMarks.put(2, 85);
        studentMarks.put(3, 78);

        // Displaying data from both HashMaps
        System.out.println("Student Details:");

        System.out.println("using for loop");
        for (Integer id : studentNames.keySet()) {
            String name = studentNames.get(id);
            Integer marks = studentMarks.get(id);
            System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
        }

        System.out.println("Using object");
        System.out.println("Student Names" + studentNames);
        System.out.println("Student Marks" + studentMarks);
    }
}
