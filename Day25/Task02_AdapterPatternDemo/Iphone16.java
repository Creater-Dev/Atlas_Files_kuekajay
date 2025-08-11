
public class Iphone16 implements Iphone {
    private Charger iphone16Adapter;

    public Iphone16(Charger iphone16Adapter) {
        this.iphone16Adapter = iphone16Adapter;
    }

    @Override
    public void onCharge() {
        iphone16Adapter.charge();
    }

    @Override
    public void offCharge() {
        iphone16Adapter.removeCharge();
    }
}