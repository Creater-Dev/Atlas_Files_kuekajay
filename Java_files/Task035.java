public class Task035 {
    // Method with char parameters
    void add(char x, char y) {
        System.out.println("Addition with characters: " + x + ", " + y);
    }

    // Method with int parameters (overloaded)
    void add(int x, int y) {
        System.out.println("Addition with integers: " + x + ", " + y);
    }

    // Main method
    public static void main(String[] args) {
        Task035 obj = new Task035();
        obj.add('d', 'a');  // Calls method with char parameters
        obj.add(100, 100);  // Calls method with int parameters
    }
}