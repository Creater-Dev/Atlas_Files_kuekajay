//Write a code to create a array list to store 5 integers and display the square of each no..
/*Hint:

List<Integer> squareofNums = numbers.stream().map(num->num*num).collect(Collectors.toList()
 */
import java.util.*;
import java.util.stream.Collectors;

public class Task7 {

    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Calculate the square of each number using streams
        List<Integer> squareOfNums = numbers.stream().map(num -> num * num).collect(Collectors.toList());
        
        // Display the squares
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Squares of the numbers: " + squareOfNums);
    }
}