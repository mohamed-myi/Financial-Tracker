package com.financialtracker.util;

import java.io.File;

public class DirectorySetup {
    private static final String DATA_DIR = "data";
    private static final String LOGS_DIR = "logs";

    public static void setupDirectories() {
        createDirectoryIfNotExists(DATA_DIR);
        createDirectoryIfNotExists(LOGS_DIR);
    }

    private static void createDirectoryIfNotExists(String dirName) {
        File dir = new File(dirName);
        if (!dir.exists()) {
            dir.mkdir();
        }
    }
}