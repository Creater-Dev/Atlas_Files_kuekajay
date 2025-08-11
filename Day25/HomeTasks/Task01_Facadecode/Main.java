public class Main {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();

        System.out.println("=== Using Bank Facade ===");
        bankFacade.getFdServiceDetails("FD12345");
        bankFacade.getLoanServiceDetails("LN67890");
        bankFacade.getAccountServiceDetails("AC11223");
    }
}
