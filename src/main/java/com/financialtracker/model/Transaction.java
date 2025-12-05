package com.financialtracker.model;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private String description;
    private double amount;
    private String category;
    private LocalDate date;
    private String type; // "income" or "expense"
    private int accountId;

    public Transaction(String description, double amount, String category, LocalDate date, String type) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.type = type;
    }

    public Transaction(int id, String description, double amount, String category, LocalDate date, String type) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.type = type;
    }

    public Transaction(int id, int accountId, String description, double amount, String category, LocalDate date, String type) {
        this.id = id;
        this.accountId = accountId;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}