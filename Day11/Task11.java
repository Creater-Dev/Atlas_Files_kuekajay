/*Wap to create an array list to remove duplicate values from the List.
Hint:
List<Integer> RemovDups= numbers.stream().distinct()
.collect(Collectors.toList());*/

import java.util.*;
import java.util.stream.Collectors;

public class Task11 {

    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        // Add some duplicate integers to the list

        // Remove duplicate values using streams
        List<Integer> removeDups = numbers.stream()
                .distinct() // Filter out duplicates
                .collect(Collectors.toList()); // Collect the distinct values into a new list

        
        System.out.println("Original List: " + numbers); // Display the original list

        // Display the list after removing duplicates
        System.out.println("List after removing duplicates: " + removeDups);

        System.out.println("using :: to print");
        removeDups.forEach(System.out::println); // Print each element in the list /instance method reference
        // referring to an instance method of a specific object
        // in this case, the method println of the System.out object

        System.out.println("using lambda to print");
        removeDups.forEach(num -> System.out.println(num)); // Print each element using a lambda expression
    }
}