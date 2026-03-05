package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SilverBankAccountTest {

    private SilverBankAccount account;
    private final int initialAmount = 1000;
    private final int bigWithdraw = 1200;
    private final int littleWithdraw = 50;
    private final int fee = 1;
    @BeforeEach
    void init(){
        this.account = new SilverBankAccount(new CoreBankAccount());
    }

    @Test
    public void testInitiallyEmpty() {
        assertEquals(0, this.account.getBalance());
    }

    @Test
    public void testCanDeposit() {
        this.account.deposit(initialAmount);
        assertEquals(initialAmount, this.account.getBalance());
    }

    @Test
    public void testCanWithdraw() {
        this.account.deposit(initialAmount);
        this.account.withdraw(littleWithdraw);
        assertEquals(initialAmount-littleWithdraw-fee, this.account.getBalance());
    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.account.deposit(initialAmount);
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(bigWithdraw));
    }

    @Test
    void cannotWithdrawExactlyBalanceBecauseOfFee() {
        account.deposit(initialAmount);
        assertThrows(IllegalStateException.class, () -> account.withdraw(initialAmount+fee));
    }


}
