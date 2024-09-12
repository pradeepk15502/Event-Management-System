import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventManagementLogin extends JFrame {

    // Constructor to setup the GUI components
    public EventManagementLogin() {
        // Set title of the frame
        setTitle("Event Management System");

        // Set the layout for the frame
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Create and add components
        JLabel titleLabel = new JLabel("Event Management System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);

        JLabel userIdLabel = new JLabel("User ID:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(userIdLabel, gbc);

        JTextField userIdField = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(userIdField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(passwordField, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(loginButton, gbc);

        JButton cancelButton = new JButton("Cancel");
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(cancelButton, gbc);

        // Add action listener for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = userIdField.getText();
                String password = new String(passwordField.getPassword());

                // Basic login logic (hardcoded admin credentials for simplicity)
                if (userId.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    // Add logic here to open Admin dashboard or next screen
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Credentials");
                }
            }
        });

        // Add action listener for the cancel button
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });

        // Set size of the frame
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        setVisible(true); // Make the frame visible
    }

    // Main method to run the program
    public static void main(String[] args) {
        new EventManagementLogin(); // Create and display the login screen
    }
}
