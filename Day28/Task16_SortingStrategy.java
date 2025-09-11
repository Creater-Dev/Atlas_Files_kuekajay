import java.util.*;

// Strategy Interface
interface SortingStrategy {
    void sort(List<String> items);
}

// Concrete Strategy 1: Alphabetical Sorting
class AlphabeticalSorting implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, String.CASE_INSENSITIVE_ORDER);
    }
}

// Concrete Strategy 2: Lengthwise Sorting
class LengthwiseSorting implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        Collections.sort(items, Comparator.comparingInt(String::length));
    }
}

// Context Class
class SortContext {
    private SortingStrategy strategy;
    private List<String> items;

    public SortContext() {
        items = new ArrayList<>();
    }

    // Set strategy dynamically
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    // Add items
    public void addItem(String item) {
        items.add(item);
    }

    // Perform sorting
    public void performSort() {
        if (strategy != null) {
            strategy.sort(items);
        } else {
            System.out.println("No sorting strategy set!");
        }
    }

    // Get sorted list
    public List<String> getList() {
        return items;
    }
}

//Main Method
public class Task16_SortingStrategy {
    public static void main(String[] args) {
        SortContext context = new SortContext();

        // Input items
        context.addItem("Stanford");
        context.addItem("Ankit");
        context.addItem("Watson");
        context.addItem("Done");

        // Apply Alphabetical sorting
        System.out.println("Alpha Sorting:");
        context.setStrategy(new AlphabeticalSorting());
        context.performSort();
        for (String s : context.getList()) {
            System.out.println(s);
        }

        // Apply Lengthwise sorting
        System.out.println("\nLengthwise Sorting:");
        context.setStrategy(new LengthwiseSorting());
        context.performSort();
        for (String s : context.getList()) {
            System.out.println(s);
        }
    }
}
