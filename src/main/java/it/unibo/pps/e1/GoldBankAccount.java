package it.unibo.pps.e1;

    public class GoldBankAccount implements BankAccount {

        private final CoreBankAccount base;
        private final FeePolicy feePolicy;
        private final WithdrawPolicy withdrawPolicy;

        public GoldBankAccount() {
            this.base = new CoreBankAccount();
            this.feePolicy = new FixedFeePolicy(0);
            this.withdrawPolicy = new OverdraftWithdrawPolicy(500);
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
