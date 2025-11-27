package com.financialtracker;

import javax.swing.*;

public class FinancialTracker {
    private static final String APP_TITLE = "Financial Tracker";
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = createMainWindow();
            frame.setVisible(true);
        });
    }

    private static JFrame createMainWindow() {
        // Create main application window
        JFrame frame = new JFrame(APP_TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.add(new JLabel("Financial Tracker - Initial Setup"));
        frame.add(mainPanel);

        return frame;
    }
}