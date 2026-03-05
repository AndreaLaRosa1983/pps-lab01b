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
}
