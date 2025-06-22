/*Example: Here we are taking a student class and creating an array of Student with
five Student objects stored in the array. The Student objects have to be instantiated
using the constructor of the Student class, and their references should be assigned 
to the array elements.*/

class Student { // Class representing a student
    int rollNo; 
    String name;
    public Student(int rollNo, String name) { // Constructor to initialize roll number and name
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class Task023 { // Class Task023 - Demonstrating array of objects
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] arrStudents = new Student[5];
        // Initializing the elements of the array with Student objects
        arrStudents[0] = new Student(1, "Aman");
        arrStudents[1] = new Student(2, "Vaibhav");
        arrStudents[2] = new Student(3, "Shikar");
        arrStudents[3] = new Student(4, "Dharmesh");
        arrStudents[4] = new Student(5, "Mohit");
        // Printing the details of each student in the array
        for (int i = 0; i < arrStudents.length; i++) {
            System.out.println("Element at " + i + " { " + arrStudents[i].rollNo + " " + arrStudents[i].name + " }");
        }
    }  
}
