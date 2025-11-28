package com.financialtracker.model;

public class Budget {
    private int id;
    private String category;
    private double limit;
    private double spent;

    public Budget(String category, double limit) {
        this.category = category;
        this.limit = limit;
        this.spent = 0;
    }

    public Budget(int id, String category, double limit, double spent) {
        this.id = id;
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    // Returns remaining budget available for this category
    public double getRemainingBudget() {
        return limit - spent;
    }
}