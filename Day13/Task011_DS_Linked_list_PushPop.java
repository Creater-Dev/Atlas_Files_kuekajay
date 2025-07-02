//Create a linked list and use push and pop methods.
import java.util.LinkedList;

public class Task011_DS_Linked_list_PushPop {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Using push to add elements to the front of the list
        linkedList.push("First");
        linkedList.push("Second");
        linkedList.push("Third");

        System.out.println("Linked List after push operations: " + linkedList);

        // Using pop to remove elements from the front of the list
        String poppedElement1 = linkedList.pop();
        System.out.println("Popped Element: " + poppedElement1);
        System.out.println("Linked List after first pop: " + linkedList);

        String poppedElement2 = linkedList.pop();
        System.out.println("Popped Element: " + poppedElement2);
        System.out.println("Linked List after second pop: " + linkedList);
    }
}