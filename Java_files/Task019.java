//Enums
//Attaching Multiple values
import java.util.HashMap; // Importing HashMap for storing mappings
import java.util.Map; // Importing Map interface for type safety
// File: Element.java
enum Element {
    H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f),
    NE("Neon", 10, 20.180f);

    private static final Map<String, Element> BY_LABEL = new HashMap<>(); // Map to store elements by their label
    private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<>(); // Map to store elements by their atomic number
    private static final Map<Float, Element> BY_ATOMIC_WEIGHT = new HashMap<>(); // Map to store elements by their atomic weight
    
    static {
        for (Element e : values()) {    //for each loop
            BY_LABEL.put(e.label, e); 
            BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
            BY_ATOMIC_WEIGHT.put(e.atomicWeight, e);
        }
    }
    public final String label; // The label of the element (e.g., "Hydrogen")
    public final int atomicNumber; // The atomic number of the element (e.g., 1 for Hydrogen)
    public final float atomicWeight; // The atomic weight of the element (e.g., 1.008 for Hydrogen)

    private Element(String label, int atomicNumber, float atomicWeight) { // Constructor to initialize the element's properties
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public static Element valueOfLabel(String label) { // Method to get an Element by its label
        return BY_LABEL.get(label);
    }

    public static Element valueOfAtomicNumber(int number) { // Method to get an Element by its atomic number
        return BY_ATOMIC_NUMBER.get(number);
    }

    public static Element valueOfAtomicWeight(float weight) { // Method to get an Element by its atomic weight
        return BY_ATOMIC_WEIGHT.get(weight);
    }
}

public class Task019 { // Class Task019 - Demonstrating the use of Enums with multiple values
    public static void main(String[] args) { // Main method to run the program
        // Accessing elements using the static methods
        for (Element e : Element.values()) { // Loop through all elements in the Element enum
            System.out.println("Element: " + e.label); // Print the label of the element
            System.out.println("Symbol: " + Element.valueOfLabel(e.label)); // Print the label of the element
            System.out.println("Atomic Number: " + e.atomicNumber); // Print the atomic number of the element
            System.out.println("Atomic Weight: " + e.atomicWeight); // Print the atomic weight of the element
            System.out.println("-------------------------");
        } //
    }
}


      

