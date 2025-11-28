package com.financialtracker.config;

import java.io.File;

public class DatabaseConfig {
    // Database file location for storing financial data
    public static final String DB_FILE_PATH = "data/financialtracker.db";
    public static final String DB_URL = "jdbc:sqlite:" + DB_FILE_PATH;

    public static void initializeDatabaseDirectory() {
        File dataDir = new File("data");
        if (!dataDir.exists()) {
            dataDir.mkdir();
        }
    }
}