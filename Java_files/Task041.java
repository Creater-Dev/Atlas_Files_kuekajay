// Interface declaration
interface testInterface {
    final int a = 10;// Abstract method
    void display();
}
class TestClass implements testInterface {
    // Implementing interface method
    public void display() {
        System.out.println("Myclass");
    }
}
public class Task041 {
    public static void main(String[] args) {
        TestClass t = new TestClass(); // Creating an instance of TestClass

        t.display(); // Calls display method
        System.out.println(testInterface.a); 
    }
}