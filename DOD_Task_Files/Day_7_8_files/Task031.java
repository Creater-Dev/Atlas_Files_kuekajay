//parent class Calculation

class Calculation { // Class Calculation
   int z;
	
   public void addition(int x, int y) { // Method to add two numbers
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) { // Method to subtract two numbers
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
}
// Child class: Inheriting Calculation
// This class extends the Calculation class to inherit its methods
public class Task031 extends Calculation { // Class Task031 extends Calculation
   // This class inherits the methods from Calculation class
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z); //
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      Task031 demo = new Task031();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
}
