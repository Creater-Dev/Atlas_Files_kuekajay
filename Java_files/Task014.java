public class Task014 { // class Task014- Try the code and display the output… 
    public static void main(String[] args) {
		char[] arr = {'a','e','i','o','u'};
		System.out.println(arr);
		String[] names = {"Meena", "Tina", "Veena", "heena"};
		System.out.println(names[0]);
		names[1]= "Reena";
		System.out.println(names[1]);
		System.out.println(names.length);
		System.out.println(names[4]); /*This will throw an ArrayIndexOutOfBoundsException 
        because the index 4 is out of bounds for the array of length 4 */
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
	}  // end of main method
}// end of class Task014
