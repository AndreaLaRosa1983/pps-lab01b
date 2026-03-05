package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest {

    private BronzeBankAccount account;
    private final int initialAmount = 1000;
    private final int bigWithdraw = 100;
    private final int littleWithdraw = 50;
    private final int bronzeFee = 1;
    @BeforeEach
    void init(){
        this.account = new BronzeBankAccount();
    }

    @Test
    void testInitiallyEmpty() {
        assertEquals(0, this.account.getBalance());
    }

    @Test
    public void testWithdrawBelow100HasNoFee() {
        this.account.deposit(initialAmount);
        this.account.withdraw(littleWithdraw);
        assertEquals(initialAmount-littleWithdraw, this.account.getBalance());
    }

    @Test
    public void testWithdrawAbove100HasFee() {
        this.account.deposit(initialAmount);
        this.account.withdraw(bigWithdraw);
        assertEquals(initialAmount-bigWithdraw-bronzeFee, this.account.getBalance());
    }
}
