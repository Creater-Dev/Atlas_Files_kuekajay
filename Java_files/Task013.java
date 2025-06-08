public class Task013 { // class Task013- Wap to display numbers from 10 to 1 .. skip 7 and 5.
    public static void main(String[] args) { // main method
        for ( int i=10; i>0; i--) { // for loop to iterate from 10 to 1
            if (i==7 || i==5) { // if condition to skip 7 and 5
                continue; // skip the current iteration
            }
            System.out.println(i); // print the current number
        } // end of for loop
    } // end of main method  
} // end of class Task013
