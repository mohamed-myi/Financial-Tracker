package com.financialtracker.model;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class TransactionTest {
    @Test
    public void testTransactionCreation() {
        LocalDate date = LocalDate.now();
        Transaction transaction = new Transaction("Groceries", 50.0, "Food", date, "expense");
        
        assertEquals("Groceries", transaction.getDescription());
        assertEquals(50.0, transaction.getAmount(), 0.01);
        assertEquals("Food", transaction.getCategory());
        assertEquals(date, transaction.getDate());
        assertEquals("expense", transaction.getType());
    }

    @Test
    public void testTransactionWithId() {
        LocalDate date = LocalDate.now();
        Transaction transaction = new Transaction(1, "Salary", 3000.0, "Income", date, "income");
        
        assertEquals(1, transaction.getId());
        assertEquals("Salary", transaction.getDescription());
    }
}