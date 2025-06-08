public class Task036 {
    // Method with int and float parameters
    void add(int x, float y) {
        System.out.println("Addition with int-float: " + x + ", " + y);
    }

    // Method with float and int parameters (overloaded)
    void add(float x, int y) {
        System.out.println("Addition with float-int: " + x + ", " + y);
    }

    // Main method
    public static void main(String[] args) {
        Task036 obj = new Task036();
        obj.add(10.50f, 60); // Calls method with float-int sequence
        obj.add(100, 80.80f); // Calls method with int-float sequence
    }
}