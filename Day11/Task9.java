/*Task 9:
Write a code to create an array list and filter the values which are odd numbers and display them..
Hint:
List<Integer> addNumbers = numbers.stream()
.filter(num -> num % 2 !=0)
.collect(Collectors.toList()); */

import java.util.*; 
import java.util.stream.Collectors; 

public class Task9 { 

    public static void main(String[] args) { // Main method to execute the program
        // Create an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>(); //<> is used to specify the type of elements in the list
        // This is a generic type, allowing us to store any type of object in the list

        // Add 10 integers to the list
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Filter odd numbers using streams
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0) // Check if the number is odd
                .collect(Collectors.toList()); // Collect the filtered odd numbers into a new list
        
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Check if the number is even
                .collect(Collectors.toList()); // Collect the filtered even numbers into a new list

        // Display the odd numbers
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
