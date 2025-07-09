// Task 6:
// Find an element in the stack and display the position
// Hint 👍
// Int position = names.search(“value”);

import java.util.Stack;
public class Task006_Stack_Search {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Kadiyala");
        names.push("Ajay");
        names.push("Kumar");

        String searchValue = "Ajay1";
        int position = names.search(searchValue);

        if (position != -1) {
            System.out.println("Element '" + searchValue + "' found at position: " + position);
        } else {
            System.out.println("Element '" + searchValue + "' not found in the stack.");
        }
    }
}