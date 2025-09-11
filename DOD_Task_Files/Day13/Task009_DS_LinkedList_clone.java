// Create a linked list add few items and
// clone the 1st linked list with the 2nd linked list
import java.util.*;

public class Task009_DS_LinkedList_clone {
    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");
        originalList.add("Yellow");

        // Cloning the original linked list
        LinkedList<String> clonedList = new LinkedList<>(originalList);

        // Displaying the original and cloned linked lists
        System.out.println("Original Linked List: " + originalList);
        System.out.println("Cloned Linked List: " + clonedList);
    }
}