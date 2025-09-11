import java.util.*;

public class Task012 {

    public static void main(String[] args) {
        
        AbstractList<String> aL = new ArrayList<>();

        aL.add("Ajay Kumar");
        aL.add("Kadiayala");

        System.out.println("Original ArrayList: " + aL);
        // Using the get method to retrieve elements

        aL.add(1, "Hello");
        
        System.out.println("After adding element at index 1: " + aL);
        // Using the get method to retrieve elements

        aL.remove(0);
        System.out.println("Element removed from index 0: " + aL);

        aL.remove("Ajay Kumar");
        System.out.println("Element Ajay Kumar removed: " + aL);

        aL.set(0, "K");
        System.out.println("List after update of value " + aL);
       }
}
