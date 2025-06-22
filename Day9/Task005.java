public class Task005 { //Excep Test
    // This class demonstrates exception handling in Java
    public static void main(String args[]) {
        try {
            int a[] = new int[2];

            // Handle ArithmeticException separately
            try {
                int b = 0;
                int c = 1 / b; // Division by zero
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException thrown: " + e);
            }

            System.out.println("Access element three: " + a[3]); // Out-of-bounds error
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException thrown: " + e);
        } catch (Exception e) {
            System.out.println("General Exception thrown: " + e);
        }

        System.out.println("Out of the block");
    }
}