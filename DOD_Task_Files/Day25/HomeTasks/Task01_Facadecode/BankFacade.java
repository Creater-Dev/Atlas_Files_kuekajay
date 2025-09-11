public class BankFacade {

    private FdService fdService;
    private LoanService loanService;
    private AccountService accountService;

    // Constructor
    public BankFacade() {
        this.fdService = new FdService();
        this.loanService = new LoanService();
        this.accountService = new AccountService();
    }

    public void getFdServiceDetails(String accountNo) {
        fdService.getFdServiceDetails(accountNo);
    }

    public void getLoanServiceDetails(String accountNo) {
        loanService.getLoanDetails(accountNo);
    }

    public void getAccountServiceDetails(String accountNo) {
        accountService.getAccountDetails(accountNo);
    }
}
