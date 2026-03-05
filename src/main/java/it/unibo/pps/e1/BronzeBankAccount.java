package it.unibo.pps.e1;

public class BronzeBankAccount implements BankAccount{
    private final CoreBankAccount base = new CoreBankAccount();

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
        this.base.withdraw(amount);
    }
}
