import java.util.Stack;

public class Task008_stack_empty {

    public static void main(String[] args) {
        Stack<Object> myStack = new Stack<>();

        System.out.println("Is the stack empty?." + myStack.empty());

        myStack.push(10);
        myStack.push("Hello");
        myStack.push(3.14);

        System.out.println("Stack after adding elements: " + myStack);
        System.out.println("Is the stack empty?." + myStack.empty());

        while (!myStack.isEmpty()) {
            System.out.println("Popped: " + myStack.pop());
        }
        System.out.println("Is the stack empty?." + myStack.empty());
    }
}
