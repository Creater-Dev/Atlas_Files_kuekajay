interface PaymentMethod {
    void process(double amount);
}
class CreditCardPayment implements PaymentMethod {
    public void process(double amount) {
        System.out.println("Processing credit card payment of Rs" + amount);
    }
}

class PayPalPayment implements PaymentMethod {
    public void process(double amount) {
        System.out.println("Processing PayPal payment of Rs" + amount);
    }
}

class BitcoinPayment implements PaymentMethod {
    public void process(double amount) {
        System.out.println("Processing Bitcoin payment of Rs" + amount);
    }
}
class PaymentProcessor {
    public void processPayment(PaymentMethod method, double amount) {
        method.process(amount);
    }
}
public class Task03_PaymentProcessor {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new CreditCardPayment(), 100.0);
        processor.processPayment(new PayPalPayment(), 200.0);
        processor.processPayment(new BitcoinPayment(), 300.0);
    }
}
