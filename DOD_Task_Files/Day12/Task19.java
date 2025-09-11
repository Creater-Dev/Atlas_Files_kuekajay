
// Try to add 1 null value in the key and run the hash map code..
// Also add one more null value to the key and see the result..
import java.util.*;

public class Task19 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(101, "Prasunamba");
        hmap.put(null, "Meher");
        hmap.put(null, ".MK");
        System.out.println(hmap);
        System.out.println("Size of HashMap: " + hmap.size());
        
    }
}
