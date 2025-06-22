public class Task015 { // class Task015- StringHandling
    public static void main(String[] args) {
        String str1 = "Java Strings"; // String declaration
        String str2 = new String(str1); // String creation using new keyword
        // This creates a new String object with the same content as str1
        String str3 = new String("are easy to learn"); // String creation using new keyword
        char[] arr = {'s', 't', 'r', 'i', 'n', 'g'}; // Character array
        String str4 = new String(arr); // String creation from character array
        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4); // Print strings
        
        if (str1.equals(str2)) { // compare str1 and str2 for content equality
            // This checks if the content of both strings is the same
            // It does not check if they are the same object in memory
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");        
        }
        if (str1==str2) { // compare str1 and str2 for reference equality
            // This checks if both references point to the same object in memory
            System.out.println("str1 and str2 are same");
        } else {
            System.out.println("str1 and str2 are not same");
        }
    } // end of main method
} // end of class Task015
