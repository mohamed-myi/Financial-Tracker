package com.financialtracker.model;

import java.time.LocalDate;

public class Account {
    private int id;
    private int userId;
    private String accountName;
    private String accountType; // "checking", "savings", "credit", etc.
    private double balance;
    private LocalDate createdDate;

    public Account(int userId, String accountName, String accountType, double balance, LocalDate createdDate) {
        this.userId = userId;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance = balance;
        this.createdDate = createdDate;
    }

    public Account(int id, int userId, String accountName, String accountType, double balance, LocalDate createdDate) {
        this.id = id;
        this.userId = userId;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance = balance;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    // Returns total account value (useful for net worth calculations)
    public double getAccountValue() {
        return balance;
    }
}