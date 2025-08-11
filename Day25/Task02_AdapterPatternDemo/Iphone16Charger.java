
public class Iphone16Charger implements Charger {
    public Iphone16Charger() {
        System.out.println("Iphone16 Charger created");
    }

    @Override
    public void charge() {
        System.out.println("Charging iPhone 16 using Iphone16Charger...");
    }

    @Override
    public void removeCharge() {
        System.out.println("Stopped charging iPhone 16.");
    }
}