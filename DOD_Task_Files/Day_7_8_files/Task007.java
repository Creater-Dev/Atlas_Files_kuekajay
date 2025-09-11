class customer { //class customer (parent class)
    void accept() {
        System.out.println("Display customer called ");
    }
    void display() {
        System.out.println("Display customer called ");
    }
} // end of customer class

public class Task007 {

    public static void main(String[] args) { //main method
        customer c = new customer(); //create an instance of customer
        c.accept(); //call accept method
        c.display(); //call display method
    } //end of main method
} // end of Task007 class