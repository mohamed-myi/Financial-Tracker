package com.financialtracker.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class BudgetTest {
    @Test
    public void testBudgetCreation() {
        Budget budget = new Budget("Food", 500.0);
        
        assertEquals("Food", budget.getCategory());
        assertEquals(500.0, budget.getLimit(), 0.01);
        assertEquals(0, budget.getSpent(), 0.01);
    }

    @Test
    public void testRemainingBudget() {
        Budget budget = new Budget("Entertainment", 200.0);
        budget.setSpent(75.0);
        
        assertEquals(125.0, budget.getRemainingBudget(), 0.01);
    }
}