package it.unibo.pps.e1;

public class FixedFeePolicy implements FeePolicy {
    private final int fee;

    public FixedFeePolicy(final int fee) {
        this.fee = fee;
    }

    @Override
    public int fee(final int amount) {
        return fee;
    }
}