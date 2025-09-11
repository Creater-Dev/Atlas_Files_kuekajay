class Student {
    private int roll_no = 0;

    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }

    public void setRoll(int roll) {
        if (!(roll > 100)) {  // condition properly closed
            roll_no = roll;
        }
    }
}

 public class Task06_LooseCoupling {
    public static void main(String[] args) {
        Student sobj = new Student(); // Person pobj = new Student(); // would work if Student extends Person
        sobj.setRoll(10);
        System.out.println("The roll no of student is " + sobj.getRoll());
    }
}
