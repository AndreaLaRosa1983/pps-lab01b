package it.unibo.pps.e1;

public interface WithdrawPolicy {
    boolean canWithdraw(int currentBalance, int amount, int fee);
}