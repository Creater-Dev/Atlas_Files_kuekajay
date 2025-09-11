public class Task020 { // Class Task020- Create an array of your name kadiyala Ajay Kumar
    public static void main(String[] args) { // Main method to run the program
        char[] nameArray = {'k', 'a', 'd', 'i', 'y', 'a', 'l', 'a', 
        ' ', 'A', 'j', 'a', 'y', ' ', 'K', 'u', 'm', 'a', 'r'}; 
        // Array of characters representing the name
        System.out.println(nameArray); // Print the array of characters
        int length = nameArray.length; // Get the length of the array
        System.out.println("Length of the name array: " + length); // Print the length of the array
        
        for (int i = 0; i < length; i++) { // Loop through each character in the array
            System.out.print(nameArray[i]); // Print each character on a new line
        } // End of for loop
        System.out.println(" //Using iteration"); // print loop using iteration
        
        for ( char c : nameArray) { // Enhanced for loop to iterate through each character in the array
            System.out.print(c); // Print each character without a new line
        } // End of enhanced for loop
        System.out.println(" //Using enhanced for loop"); // Print a message before using the enhanced for loop
    } // End of main method
} // End of class Task020
