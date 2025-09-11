// Parent class (single inheritance)
class Calculation {
    int z;
    public void addition(int x, int y) {
        z = x + y;
        System.out.println("Sum: " + z);
    }
}

class Clock {
    void showTime();
}

// Child class: Inheriting Calculation and implementing Clock
public class Task032 extends Calculation, Clock {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("Product: " + z);
    }

    public void showTime() {
        System.out.println("Showing time: 10:30 AM");
    }

    public static void main(String[] args) {
        Task032 demo = new Task032();
        demo.addition(20, 10);
        demo.multiplication(20, 10);
        demo.showTime();
    }
}