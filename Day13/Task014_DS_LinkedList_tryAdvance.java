import java.util.*;

public class Task014_DS_LinkedList_tryAdvance {
    public static void main(String[] args) {
        // Create and fill the LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");
        fruits.add("Elderberry");
        fruits.add("Fig");

        // Get a Spliterator
        Spliterator<String> spliterator1 = fruits.spliterator();

        // Try splitting
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        // Display first half
        System.out.println("First half of the list:");
        while (spliterator1.tryAdvance((item) -> System.out.println(item)));

        // Display second half
        System.out.println("\nSecond half of the list:");
        while (spliterator2.tryAdvance((item) -> System.out.println(item)));
    }
}
