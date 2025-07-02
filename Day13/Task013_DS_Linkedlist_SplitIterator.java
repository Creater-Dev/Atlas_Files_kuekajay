import java.util.*;

public class Task013_DS_Linkedlist_SplitIterator {
    public static void main(String[] args) {

        LinkedList<String> lobj = new LinkedList<>();

        lobj.add("Ajay");
        lobj.add("Kumar");
        lobj.add("Hi");
        lobj.add("Hello");

        System.out.println(lobj);

        Spliterator<String> sitobj = lobj.spliterator();

        System.out.println("Splitting the list:");
        sitobj.forEachRemaining(System.out::println);
    }
}
