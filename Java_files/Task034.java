public class Task034 {
    // Method with two parameters
    void add(int x, int y) {
        System.out.println("Addition with two parameters: " + x + ", " + y);
    }

    // Method with three parameters (overloaded)
    void add(int x, int y, int z) {
        System.out.println("Addition with three parameters: " + x + ", " + y + ", " + z);
    }

    // Main method
    public static void main(String[] args) {
        Task034 obj = new Task034();
        obj.add(10, 20, 30); // Calls method with three parameters
        obj.add(50, 100);    // Calls method with two parameters
    }
}