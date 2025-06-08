public class Task005 { //class task005 - a program to check if a is greater or b.. Use ternary operator
    public static void main(String[] args) { //main method
        int a = 10; //declare and initialize a
        int b = 20; //declare and initialize b
        String result = (a > b) ? "a is greater than b" : "b is greater than a"; //ternary operator to check which is greater
        System.out.println(result + " //using result variable"); //print the output using the result variable
        // Alternatively, using the ternary operator directly in the print statement
        System.out.println(a>b ? "a is greater than b" : "b is greater than a"+ " //Using directly"); /*print the result using ternary 
        operator directly */
    } //end of main method
} //end of class task005
