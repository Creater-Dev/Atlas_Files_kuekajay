import java.util.Stack;


public class Task005_Stack_Pop {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Kadiyala");
        names.push("Ajay");
        names.push("Kumar");

        System.out.println(" Before Delete:");

        System.out.println("Stack of names: " + names);

        System.out.println("After Delete:");
        String dummy = names.pop(); // Pop the top element from the stack
        System.out.println("Stack of names: " + names);
        System.out.println("Deleted element: " + dummy);

    }
}