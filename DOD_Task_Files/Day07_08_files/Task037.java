class Employee { // Parent class: Employee
    private int pwd; // Private: Not accessible directly in child class
    protected int Salary; // Protected: Accessible in child class
    public int empid; // Public: Accessible in child class

    Employee() {     // Constructor to initialize values
        this.pwd = 1254;
        this.Salary = 40000;
        this.empid = 10001;
    }
    public int getPwd() {   // Getter for 'pwd' since it's private
        return pwd; // Accessing private variable through method
    }
}
class Hr extends Employee { //Child class: Hr extends Employee
    // Constructor in child class to modify values using 'super'
    Hr() {
        super.Salary = 50000; // Accessing protected variable
        super.empid = 20002;  // Accessing public variable
        // super.pwd = 1234; // Cannot access private variable directly
    }

    // Display method
    void display() {
        System.out.println("HR Salary: " + super.Salary);  // Accessing protected variable
        System.out.println("HR Employee ID: " + super.empid); // Accessing public variable
        System.out.println("HR Pwd: " + super.getPwd()); // Accessing private variable via getter method
    }
}
// Main class to run the program
public class Task037 {
    public static void main(String[] args) {
        Hr hrObj = new Hr();
        hrObj.display(); // Call method to display values
    }
}