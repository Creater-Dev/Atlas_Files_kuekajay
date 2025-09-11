package Dmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DManager {
    private static DManager instance;         // Singleton instance
    private final List<String> items;         // Thread-safe list

    // Private constructor
    private DManager() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created!");
        }
        items = Collections.synchronizedList(new ArrayList<>());
    }

    // Get singleton instance
    public static synchronized DManager getInstance() {
        if (instance == null) {
            instance = new DManager();
        }
        return instance;
    }

    // Add item
    public synchronized void addItem(String item) {
        items.add(item);
        System.out.println("Item added: " + item);
    }

    // Remove item
    public synchronized void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println("Item removed: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }

    // List items
    public synchronized void listItems() {
        if (items.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Current Items: " + items);
        }
    }
}
