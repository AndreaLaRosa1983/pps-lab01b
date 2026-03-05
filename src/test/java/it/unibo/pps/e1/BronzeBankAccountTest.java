package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest {

    private BronzeBankAccount account;

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
        this.account.deposit(99);
        this.account.withdraw(49);
        assertEquals(50, this.account.getBalance());
    }

    @Test
    public void testWithdrawAbove100HasFee() {
        this.account.deposit(100);
        this.account.withdraw(50);
        assertEquals(49, this.account.getBalance());
    }
}
