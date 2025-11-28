package com.financialtracker.model;

import java.time.LocalDate;

public class Report {
    private int id;
    private int userId;
    private String reportType; // "monthly", "yearly", "custom"
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalIncome;
    private double totalExpense;
    private LocalDate generatedDate;

    public Report(int userId, String reportType, LocalDate startDate, LocalDate endDate, double totalIncome, double totalExpense) {
        this.userId = userId;
        this.reportType = reportType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.generatedDate = LocalDate.now();
    }

    public Report(int id, int userId, String reportType, LocalDate startDate, LocalDate endDate, double totalIncome, double totalExpense, LocalDate generatedDate) {
        this.id = id;
        this.userId = userId;
        this.reportType = reportType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.generatedDate = generatedDate;
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

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }

    // Returns net income (income minus expenses)
    public double getNetIncome() {
        return totalIncome - totalExpense;
    }
}