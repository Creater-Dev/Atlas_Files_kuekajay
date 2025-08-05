// Wap to create a class Student.. With 3 methods 
// 	registrationDetails(), marksCalc(), feesCalc().

class Student {
    private String name;
    private int rollNumber;
    private double[] marks;
    private double fees;

    public Student(String name, int rollNumber, double[] marks, double fees) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.fees = fees;
    }

    public void registrationDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public double marksCalc() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length; // Return average marks
    }

    public double feesCalc() {
        return fees; // Return the fees amount
    }

    public static void main(String[] args) {
        double[] studentMarks = {85.5, 90.0, 78.5};
        Student student = new Student("Ajay Kumar", 101, studentMarks, 1500.00);
        
        student.registrationDetails();
        System.out.println("Average Marks: " + student.marksCalc());
        System.out.println("Fees: " + student.feesCalc());
    }
}