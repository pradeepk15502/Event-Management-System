import java.awt.*;
import javax.swing.*;

public class EventManagementSystemUserLogin {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Event Management System");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();
        frame.add(panel);
        
        placeComponents(panel);

        // Set the window to be visible as the default to be false
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Create JLabel for title
        JLabel title = new JLabel("Event Management System", SwingConstants.CENTER);
        title.setBounds(10, 10, 300, 25);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(title);

        // User ID label
        JLabel userLabel = new JLabel("User Id");
        userLabel.setBounds(10, 40, 80, 25);
        panel.add(userLabel);

        // User ID text field
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 40, 165, 25);
        panel.add(userText);

        // Password label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 70, 80, 25);
        panel.add(passwordLabel);

        // Password text field
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 70, 165, 25);
        panel.add(passwordText);

        // Cancel button
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(50, 110, 80, 25);
        panel.add(cancelButton);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(180, 110, 80, 25);
        panel.add(loginButton);
    }
}
