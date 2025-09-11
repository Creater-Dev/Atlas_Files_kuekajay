// What kind of collision resolution strategy is implemented in the below Hash Table ?
import java.util.LinkedList;

public class Tak01_Collision_Res_Strategy {

    // Array of linked lists to store key-value pairs
    @SuppressWarnings("unchecked")
    LinkedList<Entry>[] data = (LinkedList<Entry>[]) new LinkedList[10];

    // Method to insert or update key-value pairs
    public void put(String keyval, int value) {
        int index = Math.abs(keyval.hashCode() % data.length);

        // Initialize bucket if it's null
        if (data[index] == null) {
            data[index] = new LinkedList<>();
        }

        // Check if key already exists and update its value
        for (Entry e : data[index]) {
            if (e.keyval.equals(keyval)) {
                e.value = value;
                return;
            }
        }

        // Add new entry if key not found
        data[index].add(new Entry(keyval, value));
    }

    // Optional method to retrieve values by key
    public Integer get(String keyval) {
        int index = Math.abs(keyval.hashCode() % data.length);

        if (data[index] != null) {
            for (Entry e : data[index]) {
                if (e.keyval.equals(keyval)) {
                    return e.value;
                }
            }
        }
        return null; // key not found
    }

    // Inner class to represent a key-value pair
    static class Entry {
        String keyval;
        int value;

        Entry(String k, int v) {
            keyval = k;
            value = v;
        }

        @Override
        public String toString() {
            return keyval + " => " + value;
        }
    }

    // Demo method to show usage
    public static void main(String[] args) {
        Tak01_Collision_Res_Strategy table = new Tak01_Collision_Res_Strategy();

        table.put("apple", 10);
        table.put("banana", 20);
        table.put("grape", 30);
        table.put("apple", 40); // Update "apple"

        System.out.println("Value for 'apple': " + table.get("apple"));
        System.out.println("Value for 'banana': " + table.get("banana"));
        System.out.println("Value for 'grape': " + table.get("grape"));
        System.out.println("Value for 'orange': " + table.get("orange")); // null
    }
}
