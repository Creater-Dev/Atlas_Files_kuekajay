
public class Iphone16Adapter implements Charger {
    private Iphone16Charger iphone16Charger;

    public Iphone16Adapter() {
        this.iphone16Charger = new Iphone16Charger();
    }

    @Override
    public void charge() {
        iphone16Charger.charge();
    }

    @Override
    public void removeCharge() {
        iphone16Charger.removeCharge();
    }
}