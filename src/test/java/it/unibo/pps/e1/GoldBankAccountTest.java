package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoldBankAccountTest {

    private GoldBankAccount account;
    private final int initialAmount = 1000;
    private final int bigWithdraw = 1500;
    private final int littleWithdraw = 50;
    @BeforeEach
    void init(){
        this.account = new GoldBankAccount(new CoreBankAccount());
    }

    @Test
    void testInitiallyEmpty() {
        assertEquals(0, this.account.getBalance());
    }

    @Test
    public void testCanDeposit() {
        this.account.deposit(initialAmount);
        assertEquals(initialAmount, this.account.getBalance());
    }

    @Test
    public void testWithdrawHasNoFee() {
        this.account.deposit(initialAmount);
        this.account.withdraw(littleWithdraw);
        assertEquals(initialAmount-littleWithdraw, this.account.getBalance());
    }

    @Test
    public void testNegativeWithdraw(){
        this.account.deposit(initialAmount);
        this.account.withdraw(bigWithdraw);
        assertEquals(initialAmount-bigWithdraw, this.account.getBalance());
    }

}
