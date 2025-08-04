package com.prabhat.javapractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SumAverageGUI extends JFrame {

    private JTextField inputField;
    private JLabel resultLabel;
    private double total = 0.0;
    private int count = 0;

    public SumAverageGUI() {
        setTitle("Sum & Average Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Panel and layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 5));

        JLabel promptLabel = new JLabel("Enter a number (Enter 0 to stop):", SwingConstants.CENTER);
        inputField = new JTextField();
        resultLabel = new JLabel("Total = 0.0, Average = 0.0", SwingConstants.CENTER);

        JButton submitBtn = new JButton("Submit");
        JButton exitBtn = new JButton("Exit");

        // Submit Button Action
        submitBtn.addActionListener(e -> processInput());

        // Exit Button Action
        exitBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Exiting the program.");
            System.exit(0);
        });

        // Add components
        panel.add(promptLabel);
        panel.add(inputField);
        panel.add(resultLabel);

        JPanel btnPanel = new JPanel();
        btnPanel.add(submitBtn);
        btnPanel.add(exitBtn);
        panel.add(btnPanel);

        add(panel);
        setVisible(true);
    }

    private void processInput() {
        String input = inputField.getText().trim();

        if (!input.matches("-?\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
            return;
        }

        double num = Double.parseDouble(input);
        if (num == 0) {
            JOptionPane.showMessageDialog(this, "Zero encountered. Final Total = " + total + ", Average = " +
                    (count == 0 ? 0 : total / count));
            inputField.setText("");
            total = 0.0;
            count = 0;
            resultLabel.setText("Total = 0.0, Average = 0.0");
            return;
        }

        total += num;
        count++;

        double avg = total / count;
        resultLabel.setText("Total = " + total + ", Average = " + String.format("%.2f", avg));
        inputField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SumAverageGUI::new);
    }
}
