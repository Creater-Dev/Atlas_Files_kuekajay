public class Person { // Class representing a person
   private String name; //encapsulated variable to hold the name of the person
   /* encapsulation is a principle of object-oriented programming that restricts direct access
    to an object's data and methods, allowing controlled access through public methods. */

   // Getter
   public String getName() { // Method to get the name of the person
     return name;
   }

   // Setter
   public void setName(String newName) { // Method to set the name of the person
     this.name = newName;
   }
}
