import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class task021_DS_HashMap_SyncMap {
    public static void main(String[] args) {
        HashMap<String, Integer> Hm1 = new HashMap<>();
        
        // Create a synchronized (thread-safe) version of the map
        Map<String, Integer> syncMap = Collections.synchronizedMap(Hm1);

        // Put values
        syncMap.put("Apple", 10);
        syncMap.put("Banana", 20);
        syncMap.put("Orange", 30);

        // Iterate safely (must synchronize manually)
        synchronized (syncMap) {
            for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
