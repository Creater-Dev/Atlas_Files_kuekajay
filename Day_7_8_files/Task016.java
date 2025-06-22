// class Task016- Enums colours
    enum color{ // Enum declaration
        red, blue, // Enum constants in single line
        green,
        yellow // Enum constant
        // Enum constants are implicitly static and final
        // Enum constants are public by default
        // Enum constants can be accessed using the enum name, e.g., color.
    }
public class Task016 { // class Task016- Enums colours

	public static void main(String[] args) { // main method
        // Displaying enum constants
		color c1 = color.yellow;
		System.out.println(c1);	// Print the enum constant
        color c2 = color.red;
        color c3 = color.blue;
        System.out.println(c2 + " " + c3);// Print multiple enum constants in a single line
	}// end of main method
}// end of class Task016
