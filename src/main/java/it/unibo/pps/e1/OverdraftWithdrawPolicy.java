package it.unibo.pps.e1;

public class OverdraftWithdrawPolicy implements WithdrawPolicy {
    private final int limit;

    public OverdraftWithdrawPolicy(final int limit) {
        this.limit = limit;
    }

    @Override
    public boolean canWithdraw(final int balance, final int amount, final int fee) {
        return balance - (amount + fee) >= -limit;
    }
}