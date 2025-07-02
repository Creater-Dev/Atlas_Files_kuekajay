import java.util.LinkedList;
import java.util.ListIterator;

public class Task010_DS_LinkedList_IteratorExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add(0, "Ajay");
        names.add("Vijay");
        names.add(null);
        names.add(2, "Ravi");
        names.add(2, "Ravi_0");
        names.add("null_0");

        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " \n ");
        }
    }
}
