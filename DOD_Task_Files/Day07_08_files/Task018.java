public class Task018{ // Class Task018 - Demonstrating encapsulation with getter and setter methods

  public static void main(String[] args) { // Main method to run the program
    Person myObj = new Person(); // Create an instance of the Person class
    // Using setter and getter methods to access private variable 'name'
    myObj.setName("John"); // Set the name of the person using setter method
    System.out.println(myObj.getName()); // Print the name of the person using getter method
  }
}
