import java.awt.*;
import javax.swing.*;

public class UserOrderStatus {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("User Order Status");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a main panel with a layout manager
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);

        // Top panel (Home and Logout buttons)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        JButton homeButton = new JButton("Home");
        JButton logoutButton = new JButton("LogOut");

        topPanel.add(homeButton, BorderLayout.WEST);
        topPanel.add(logoutButton, BorderLayout.EAST);

        // Center label (User Order Status)
        JLabel userOrderStatusLabel = new JLabel("User Order Status", JLabel.CENTER);
        userOrderStatusLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Bottom panel (Form fields - Name, Email, Address, Status)
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 4, 10, 10));

        JLabel nameLabel = new JLabel("Name", JLabel.CENTER);
        JLabel emailLabel = new JLabel("E-mail", JLabel.CENTER);
        JLabel addressLabel = new JLabel("Address", JLabel.CENTER);
        JLabel statusLabel = new JLabel("Status", JLabel.CENTER);

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField addressField = new JTextField();
        JTextField statusField = new JTextField();

        bottomPanel.add(nameLabel);
        bottomPanel.add(emailLabel);
        bottomPanel.add(addressLabel);
        bottomPanel.add(statusLabel);
        bottomPanel.add(nameField);
        bottomPanel.add(emailField);
        bottomPanel.add(addressField);
        bottomPanel.add(statusField);

        // Add all panels to the main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(userOrderStatusLabel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}