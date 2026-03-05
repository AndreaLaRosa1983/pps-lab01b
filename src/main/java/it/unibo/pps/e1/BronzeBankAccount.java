package it.unibo.pps.e1;

public class BronzeBankAccount implements BankAccount {

    private final CoreBankAccount base;
    private final FeePolicy feePolicy;
    private final WithdrawPolicy withdrawPolicy;

    public BronzeBankAccount(final CoreBankAccount base) {
        this.base = base;
        this.feePolicy = new BronzeFeePolicy();
        this.withdrawPolicy = new NoOverdraftWithdrawPolicy();
    }

    @Override
    public int getBalance() {
        return base.getBalance();
    }

    @Override
    public void deposit(final int amount) {
        base.deposit(amount);
    }

    @Override
    public void withdraw(final int amount) {
        final int fee = feePolicy.fee(amount);
        if (!withdrawPolicy.canWithdraw(getBalance(), amount, fee)) {
            throw new IllegalStateException();
        }
        base.withdraw(amount + fee);
    }
}
