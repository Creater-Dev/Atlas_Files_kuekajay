/*Task 14:
Wap to run a loop / iterate()  and limit it to 20 values (1 to 2)
While displaying use for each to limit till 10 numbers.
Hint:
Stream<Integers> nums = Stream
.iterate(1, n -> n+1)
.limit(20);
Nums
.limit(10)
.foreach(System.out::println);*/
import java.util.stream.*;
public class Task14 {

    public static void main(String[] args) {
        // Create a stream of integers starting from 1, incrementing by 1
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1).limit(20);
       
       // nums.forEach(System.out::println); // Print all numbers in the stream
       // get error if you uncomment this line, as it will consume the stream
       // The stream can only be consumed once, so we limit it to 10 numbers here

        // Limit the stream to the first 10 numbers and print them
        nums.limit(10).forEach(System.out::println); //:: used to refer to a method
    }
}