package it.unibo.pps.e1;

public class No0verdraftWithdrawPolicy implements WithdrawPolicy{
        @Override
        public boolean canWithdraw(final int balance, final int amount, final int fee) {
            return balance - (amount + fee) >= 0;
        }
    }