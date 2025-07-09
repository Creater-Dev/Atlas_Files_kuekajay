import java.util.*;

class Task17 {

    public static void main(String args[]) {
        HashMap<String, String> hmobj1 = new HashMap<>();

        HashMap<Integer, String> hmobj2 = new HashMap<Integer, String>();

        hmobj1.put("K", "Anitha");
        hmobj1.put("A", "Saritha");
        hmobj1.put("D", "Ankitha");

        hmobj2.put(44, "John");
        hmobj2.put(55, "Steve");
        hmobj2.put(66, "Jack");

        System.out.println("Mapping HashMap hmobj1: " + hmobj1);

        System.out.println("Mapping HashMap hmobj2: " + hmobj2);
    }
}
