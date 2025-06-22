// Working of Abstraction in Java
// Abstract class representing gadgets
abstract class Gadgets {
    abstract void turnOn();  // Abstract method (must be overridden)
    abstract void turnOff(); // Abstract method (must be overridden)
}
// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }
    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
class ACRemote extends Gadgets { // Concrete class implementing abstract methods
    @Override
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}
class FanRemote extends Gadgets { // Additional concrete classes for Fan and Cooler
    @Override
    void turnOn() {
        System.out.println("Fan is turned ON.");
    }
    @Override
    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}
class CoolerRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Cooler is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Cooler is turned OFF.");
    }
}

public class Task040 { // Main class to demonstrate abstraction
    public static void main(String[] args) {
        // Creating separate instances of each remote
        Gadgets tv = new TVRemote();
        Gadgets ac = new ACRemote();
        Gadgets fan = new FanRemote();
        Gadgets cooler = new CoolerRemote();

        // Calling methods for each gadget
        tv.turnOn();
        tv.turnOff();
        System.out.println("----------------");

        ac.turnOn();
        ac.turnOff();
        System.out.println("----------------");

        fan.turnOn();
        fan.turnOff();
        System.out.println("----------------");

        cooler.turnOn();
        cooler.turnOff();
    }
}