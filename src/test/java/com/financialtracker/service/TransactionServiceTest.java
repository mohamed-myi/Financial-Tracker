package com.financialtracker.service;

import org.junit.Test;
import com.financialtracker.model.Transaction;
import java.time.LocalDate;
import static org.junit.Assert.*;

public class TransactionServiceTest {
    private TransactionService service = new TransactionService();

    @Test
    public void testCreateTransaction() {
        LocalDate date = LocalDate.now();
        Transaction transaction = service.createTransaction("Groceries", 50.0, "Food", date, "expense", 1);
        
        assertNotNull(transaction);
        assertEquals("Groceries", transaction.getDescription());
        assertEquals(50.0, transaction.getAmount(), 0.01);
        assertEquals("Food", transaction.getCategory());
        assertEquals("expense", transaction.getType());
    }

    @Test
    public void testGetTransactionsByUser() {
        LocalDate date = LocalDate.now();
        service.createTransaction("Salary", 3000.0, "Income", date, "income", 1);
        service.createTransaction("Rent", 1000.0, "Housing", date, "expense", 1);
        
        assertTrue(service.getTransactionsByUser(1).size() > 0);
    }
}