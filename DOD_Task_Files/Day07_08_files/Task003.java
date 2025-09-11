public class Task003 { //class task003
    public static void main(String[] args) { //main method
        int a = 2; //declare and initialize num1
        int b = 3; //declare and initialize num2
        //swapping using arithmetic operations
        a = a + b; // a becomes 5 (2 + 3)
        b = a - b; // b becomes 2 (5 - 3)
        a = a - b; // a becomes 3 (5 - 2)

        System.out.println("After swapping: a= "+ a + ", b= " + b); //print the result
    }   //end of main method
}
