package com.financialtracker.service;

import com.financialtracker.model.Transaction;
import com.financialtracker.util.DatabaseConnection;
import java.time.LocalDate;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    private Connection connection;

    public TransactionService() {
        this.connection = DatabaseConnection.getConnection();
    }

    /**
     * Input: description (string), amount (double), category (string), date (LocalDate), type (string - "income" or "expense"), userId (int)
     * Output: Transaction object with id assigned from database
     */
    public Transaction createTransaction(String description, double amount, String category, LocalDate date, String type, int userId) {
        String query = "INSERT INTO transactions (user_id, description, amount, category, date, type) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, userId);
            stmt.setString(2, description);
            stmt.setDouble(3, amount);
            stmt.setString(4, category);
            stmt.setDate(5, Date.valueOf(date));
            stmt.setString(6, type);
            
            stmt.executeUpdate();
            
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                return new Transaction(id, description, amount, category, date, type);
            }
        } catch (Exception e) {
            System.out.println("Error creating transaction: " + e.getMessage());
        }
        
        return null;
    }

    /**
     * Input: userId (int)
     * Output: List of Transaction objects for that user
     */
    public List<Transaction> getTransactionsByUser(int userId) {
        List<Transaction> transactions = new ArrayList<>();
        String query = "SELECT id, description, amount, category, date, type FROM transactions WHERE user_id = ? ORDER BY date DESC";
        
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Transaction transaction = new Transaction(
                    rs.getInt("id"),
                    rs.getString("description"),
                    rs.getDouble("amount"),
                    rs.getString("category"),
                    rs.getDate("date").toLocalDate(),
                    rs.getString("type")
                );
                transactions.add(transaction);
            }
        } catch (Exception e) {
            System.out.println("Error fetching transactions: " + e.getMessage());
        }
        
        return transactions;
    }
}