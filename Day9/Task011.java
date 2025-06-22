import java.util.ArrayList;

public class Task011 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i=1; i<=10; i++) {
            a.add(i);
        }
        // Printing ArrayList
        System.out.println("Array Elements: " );
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
