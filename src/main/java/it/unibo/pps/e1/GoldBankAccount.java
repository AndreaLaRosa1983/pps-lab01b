package it.unibo.pps.e1;

public class GoldBankAccount implements BankAccount {

    private final CoreBankAccount base = new CoreBankAccount();
    private final int OVERDRAFT_LIMIT = 500;

    public int getBalance() {
        return this.base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        this.base.deposit(amount);
    }

    public void withdraw(final int amount) {
        final int newBalance = this.getBalance() - amount;
        if (newBalance < -OVERDRAFT_LIMIT) {
            throw new IllegalStateException();
        }
        base.withdraw(amount);
    }


}
