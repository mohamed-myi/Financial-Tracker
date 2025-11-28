package com.financialtracker.model;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testAccountCreation() {
        LocalDate createdDate = LocalDate.now();
        Account account = new Account(1, "Checking", "checking", 5000.0, createdDate);

        assertEquals(1, account.getUserId());
        assertEquals("Checking", account.getAccountName());
        assertEquals("checking", account.getAccountType());
        assertEquals(5000.0, account.getBalance(), 0.01);
        assertEquals(createdDate, account.getCreatedDate());
    }

    @Test
    public void testAccountWithId() {
        LocalDate createdDate = LocalDate.now();
        Account account = new Account(5, 1, "Savings", "savings", 10000.0, createdDate);

        assertEquals(5, account.getId());
        assertEquals(1, account.getUserId());
    }

    @Test
    public void testAccountValue() {
        LocalDate createdDate = LocalDate.now();
        Account account = new Account(1, "Credit", "credit", 2500.0, createdDate);

        assertEquals(2500.0, account.getAccountValue(), 0.01);
    }
}