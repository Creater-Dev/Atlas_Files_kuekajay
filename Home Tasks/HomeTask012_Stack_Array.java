public class HomeTask012_Stack_Array {
    private int[] stack;
    private int top;
    private int capacity;

    public HomeTask012_Stack_Array(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1; // or throw exception
        }
        return stack[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HomeTask012_Stack_Array stackObj = new HomeTask012_Stack_Array(5);

        stackObj.push(10);
        stackObj.push(20);
        stackObj.push(30);
        stackObj.printStack(); // Output: Stack: 10 20 30

        System.out.println("Top element: " + stackObj.peek()); // Output: 30

        System.out.println("Popped: " + stackObj.pop()); // Output: 30
        stackObj.printStack(); // Output: Stack: 10 20

        stackObj.pop();
        stackObj.pop();
        stackObj.pop(); // Underflow case
    }
}
