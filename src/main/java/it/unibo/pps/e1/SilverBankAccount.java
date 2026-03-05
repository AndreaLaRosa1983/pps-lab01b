package it.unibo.pps.e1;

public class SilverBankAccount implements BankAccount{

    private CoreBankAccount base = new CoreBankAccount();

    public int getBalance() {
        return base.getBalance();
    }

    public void deposit(int amount) {
        base.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount + 1){  //limit case + 1000 - 1000  -1 we go negative-
            throw new IllegalStateException();
        }
        base.withdraw(amount + 1);
    }
}
