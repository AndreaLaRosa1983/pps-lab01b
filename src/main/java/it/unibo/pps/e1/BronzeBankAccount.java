package it.unibo.pps.e1;

public class BronzeBankAccount implements BankAccount{
    private final CoreBankAccount base = new CoreBankAccount();
    private final int FEE = 1;
    @Override
    public int getBalance() {
        return this.base.getBalance();
    }

    @Override
    public void deposit(int amount) {
        this.base.deposit(amount);
    }

    @Override
    public void withdraw(int amount) {
        int fee = (amount < 100) ? 0 : FEE;
        int total = amount + fee;

        if (this.getBalance() < total) {
            throw new IllegalStateException();
        }

        base.withdraw(total);
    }
}
