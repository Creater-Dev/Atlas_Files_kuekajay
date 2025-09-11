// Task007_Stack_Peek.java
import java.util.Stack;

public class Task007_Stack_Peek {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        // Peeking the top element of the stack
        int topElement = stack.peek();
        // Displaying the top element
        System.out.println("Top element of the stack: " + topElement);
        // Displaying the stack after peeking
        System.out.println("Stack after peeking: " + stack);

    }
}