package it.unibo.pps.e1;

public class GoldBankAccount implements BankAccount {

    private CoreBankAccount base = new CoreBankAccount();


    public int getBalance() {
        return this.base.getBalance();
    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }


}
