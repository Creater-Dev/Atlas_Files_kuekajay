//Wap to create linked list add 5 elements to it and replace 3 rd element with different value..

import java.util.*;

public class Task005_DS_LinkedList_ReplaceElement {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding 5 elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        // Displaying the original list
        System.out.println("Original Linked List: " + linkedList);

        // Replacing the 3rd element (index 2) with a different value
        linkedList.set(2, "Mango");

        // Displaying the modified list
        System.out.println("Modified Linked List: " + linkedList);

    }
}

