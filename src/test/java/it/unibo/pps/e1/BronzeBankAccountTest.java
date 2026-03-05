package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest {

    private BankAccount account;

    @BeforeEach
    void init() {
        this.account = new BronzeBankAccount(new CoreBankAccount());
    }