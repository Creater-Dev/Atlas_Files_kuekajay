public class ClientAdapterDpMain {
    public static void main(String[] args) {
        Iphone iphone = new Iphone16(new Iphone16Adapter());
        iphone.onCharge();
        iphone.offCharge();
    }
}