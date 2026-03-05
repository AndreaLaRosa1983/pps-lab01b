package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GoldBankAccountTest {

    private GoldBankAccount account;

    @BeforeEach
    void init(){
        this.account = new GoldBankAccount();
    }


}
