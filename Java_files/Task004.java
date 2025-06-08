public class Task004 { /*class task004 - Create a code in which you have 4 methods
    add, subtract, multiply and divide (return type int) with a main method.
    to all all the other method */
    public static int add(int a, int b) { //method to add two integers
        return a + b; //return the sum
    }
    public static int subtract(int a, int b) { //method to subtract two integers
        return a - b; //return the difference
    }
    public static int multiply(int a, int b) { //method to multiply two integers
        return a * b; //return the product
    }
    public static int divide(int a, int b) { //method to divide two integers
        return a / b; //return the quotient   
    }
    public static void main(String[] args) { //main method
        int num1 = 10; //declare and initialize num1
        int num2 = 5; //declare and initialize num2

        System.out.println("Addition: " + add(num1, num2)); //print the result of addition
        System.out.println("Subtraction: " + subtract(num1, num2)); //print the result of subtraction
        System.out.println("Multiplication: " + multiply(num1, num2)); //print the result of multiplication
        System.out.println("Division: " + divide(num1, num2)); //print the result of division
    } //end of main method 
    //end of class task004
}
