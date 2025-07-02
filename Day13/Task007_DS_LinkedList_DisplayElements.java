
// Wap to create a linked list to add 5 elements 
// and display the list using for (use get() ) and for each loops
import java.util.*;

public class Task007_DS_LinkedList_DisplayElements {

    public static void main(String args[]) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Grapes");

        // we are using get () with for loop
        System.out.println("Elements in the LinkedList using for loop with get():");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println("\n\nElements in the LinkedList using for-each loop:");
        // here we are using the foreach loop
        for (String str : fruits)
            System.out.print(str + " ");
    }
}
