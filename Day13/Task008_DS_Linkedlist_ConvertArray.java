import java.util.*;

public class Task008_DS_Linkedlist_ConvertArray {
    public static void main(String[] args) {
        LinkedList<Double> list = new LinkedList<>();

        list.add(154.10);
        list.add(99.99);
        list.add(15.15);
        list.add(200.50);

        System.out.println("Display: " + list);

        Object[] array = list.toArray();
        System.out.print("Linked list to array conversion: ");
        for (Object element : array) {
            System.out.print(element + " ");
        }
    }
}
