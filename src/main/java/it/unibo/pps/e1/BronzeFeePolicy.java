package it.unibo.pps.e1;

public class BronzeFeePolicy implements FeePolicy {
    private static final int THRESHOLD = 100;
    private static final int HIGH_FEE = 1;

    @Override
    public int fee(final int amount) {
        return amount < THRESHOLD ? 0 : HIGH_FEE;
    }
}