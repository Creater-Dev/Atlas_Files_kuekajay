/*
Wap to create an arrayList of your friends using string and try to sort them and display

Hint:
List<String> SortedNames= Names.stream()
.sorted()
.collect(Collectors.toList());
 */
import java.util.*;
import java.util.stream.Collectors;

public class Task13 {

    public static void main(String[] args) {
        // Create an ArrayList to store friends' names
        List<String> friends = Arrays.asList( "David","david","Eve","Alice","alice",
        "Charlie","Bob","1","5","2");

        // Sort the names using streams
        List<String> sortedNames = friends.stream()
                .sorted() // Sort the names in natural order
                .collect(Collectors.toList()); // Collect the sorted names into a new list

        // Display the sorted names
        System.out.println("Original Friends' Names: " + friends);
        System.out.println("Sorted Friends' Names: " + sortedNames);
    }
}