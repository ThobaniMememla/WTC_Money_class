package za.co.wethinkcode.bank;

public class BusinessAccount extends Account{

    private Money availableBalance = new Money( "0.00" );

    private String accountName;

    public BusinessAccount() {
        accountName = "Business Account";
    }

    public BusinessAccount(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public Money getAvailableBalance() {
        return availableBalance;
    }

    @Override
    public String accountName() {
        return accountName;
    }

    @Override
    public void renameAccount(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void creditAccount( Money creditAmount) {
        availableBalance = availableBalance.add(creditAmount);
    }

    @Override
    public void debitAccount( Money debitAmount) {
        availableBalance = availableBalance.subtract(debitAmount);
    }
}
