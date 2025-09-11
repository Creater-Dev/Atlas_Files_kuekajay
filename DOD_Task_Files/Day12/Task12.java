/*Wap to create  a hash table and display them..
Hint 
Import java.util.Hashtable;
Import java.util.Map;
 */
import java.util.Hashtable;
import java.util.Map;

public class Task12 {
    public static void main(String[] args) {
        // Create a Hashtable with String keys and Integer values
        Hashtable<String, Integer> studentMarks = new Hashtable<>(); //studentMarks is the object of Hashtable class

        // Add key-value pairs using put()
        studentMarks.put("Vijay", 85);
        studentMarks.put("Ajay", 92);
        studentMarks.put("Rahul", 78);

        // Display all entries in the Hashtable
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) { //map is the interface and entry is the class
            // entry.getKey() returns the key, entry.getValue() returns the value
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
