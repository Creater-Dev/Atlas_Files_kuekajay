public class Task014_1 { // class Task014- Try the code and display the output… 
// Now play with it try to access 5th index and see the output
    public static void main(String[] args) {
		char[] arr = {'a','e','i','o','u'};
		System.out.println(arr);
		System.out.println(arr[3]);
		String[] names = {"Meena", "Tina", "Veena", "heena"};
		System.out.println(names.length);
		System.out.println(names[5]); /*This will throw an ArrayIndexOutOfBoundsException 
        because the index 5 is out of bounds for the array of length 4 */
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
	}  // end of main method
}// end of class Task014
