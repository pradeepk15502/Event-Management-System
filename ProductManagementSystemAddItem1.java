import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductManagementSystemAddItem1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Product Management System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel welcomeLabel = new JLabel("Welcome 'VendorName'", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(welcomeLabel, gbc);
        
        gbc.gridwidth = 1;
        
        JLabel nameLabel = new JLabel("Product Name");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nameLabel, gbc);
        
        JTextField nameText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(nameText, gbc);
        
        JLabel priceLabel = new JLabel("Product Price");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(priceLabel, gbc);
        
        JTextField priceText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(priceText, gbc);
        
        JLabel imageLabel = new JLabel("Product Image");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(imageLabel, gbc);
        
        JTextField imageText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(imageText, gbc);
        
        JButton addButton = new JButton("Add The Product");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(addButton, gbc);
        
        JButton deleteButton = new JButton("Delete");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(deleteButton, gbc);
        
        JButton updateButton = new JButton("Update");
        gbc.gridx = 2;
        gbc.gridy = 4;
        panel.add(updateButton, gbc);
        
        JLabel statusLabel = new JLabel("Product Status");
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(statusLabel, gbc);
        
        JButton requestItemButton = new JButton("Request Item");
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(requestItemButton, gbc);
        
        JButton viewProductButton = new JButton("View Product");
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel.add(viewProductButton, gbc);
        
        JButton logoutButton = new JButton("Log Out");
        gbc.gridx = 2;
        gbc.gridy = 6;
        panel.add(logoutButton, gbc);

        // Action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Add Product logic here
                JOptionPane.showMessageDialog(frame, "Add Product button clicked!");
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Delete logic here
                JOptionPane.showMessageDialog(frame, "Delete button clicked!");
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Update logic here
                JOptionPane.showMessageDialog(frame, "Update button clicked!");
            }
        });

        requestItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Request Item logic here
                JOptionPane.showMessageDialog(frame, "Request Item button clicked!");
            }
        });

        viewProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle View Product logic here
                JOptionPane.showMessageDialog(frame, "View Product button clicked!");
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Log Out logic here
                JOptionPane.showMessageDialog(frame, "Log Out button clicked!");
            }
        });

        frame.setVisible(true);
    }
}
