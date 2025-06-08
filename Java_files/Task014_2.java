public class Task014_2 { // class Task014- Try the code and display the output… 
//try to access -1 index and see the output..
    public static void main(String[] args) {
		char[] arr = {'a','e','i','o','u'};
		System.out.println(arr);
		String[] names = {"Meena", "Tina", "Veena", "heena"};
		System.out.println(names.length);
		System.out.println(names[-1]); /*This will throw an ArrayIndexOutOfBoundsException 
        because the index -1 is out of bounds for the array of length 4 index starts form 0 and ends at 3 */
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
	}  // end of main method
}// end of class Task014
