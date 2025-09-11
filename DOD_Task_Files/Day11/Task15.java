/*Wap to create an array List skip 15 numbers and print the output using foreach loop

HInt:
Stream<Integers> nums = Stream
.iterate(1, n -> n+1)
.limit(20);
Stream<Integer> SkipNums = nums.skip(15);
Nums.foreach(System.out::println);*/

import java.util.stream.*;
public class Task15 {

    public static void main(String[] args) {
        // Create a stream of integers starting from 1, incrementing by 1
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1).limit(20);

        // Skip the first 15 numbers and print the remaining ones
        Stream<Integer> skipNums = nums.skip(15);
        
        // Print the skipped numbers using forEach
        skipNums.forEach(System.out::println); // :: used to refer to a method
    }
}