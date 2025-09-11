class Student{ // Class representing a student
   public String name; // Variable to store the name of the student
    Student(String name){ // Constructor to initialize the name of the student
       this.name = name; // Assigning the name to the instance variable
   }
    
  @Override
   public String toString(){ // Overriding the toString method to return the name of the student
         // This method is called when the object is printed
       return name; // Returning the name of the student
   }
}

public class Task024 {
   public static void main (String[] args){ 
       // declares an Array and initializing the
      // elements of the array
       Student[] myStudents = new Student[]{
         new Student("Dharma"),new Student("sanvi"),
         new Student("Rupa"),new Student("Ajay")
       };
        // accessing the elements of the specified array
       for(Student m:myStudents){   
           System.out.println(m);
       }
   }
}
