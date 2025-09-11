class OuterClass { // Outer class
  int x = 10;
  class InnerClass {
    int y = 5;
  }
}

public class Main { // Main class
  public static void main(String[] args) { // Main method
    OuterClass myOuter = new OuterClass(); // Create an instance of OuterClass
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
