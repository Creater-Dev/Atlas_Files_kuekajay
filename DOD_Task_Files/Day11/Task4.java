import java.lang.FunctionalInterface;

// This is a functional interface
@FunctionalInterface
interface MyInterface {
    // Abstract method
    double getPiValue();
}

public class Task4 {
    public static void main(String[] args) {
        // Declare a reference to MyInterface using a lambda expression
        MyInterface ref = () -> 3.1415;

        // Call the method and print the result
        System.out.println("Value of Pi = " + ref.getPiValue());
    }
}
