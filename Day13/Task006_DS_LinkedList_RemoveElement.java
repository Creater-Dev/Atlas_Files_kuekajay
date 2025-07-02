//Wap to create linked list add 5 elements to it and replace 3 rd element with different value..

import java.util.*;

public class Task006_DS_LinkedList_RemoveElement {
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

        // Removing the 3rd element (index 2) from the linked list
        linkedList.remove(2);
        System.out.println("Linked List after Index removal " + linkedList);

        //Object removal
        linkedList.remove("Date");

        // Displaying the modified list
        System.out.println("Linked List after Object removal " + linkedList);

    }
}

