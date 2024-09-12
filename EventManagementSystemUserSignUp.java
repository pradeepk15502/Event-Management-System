import java.awt.*;
import javax.swing.*;

public class EventManagementSystemUserSignUp {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Event Management System");
        frame.setSize(400, 300);
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
        title.setBounds(10, 10, 360, 25);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(title);

        // Name label
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 60, 80, 25);
        panel.add(nameLabel);

        // Name text field
        JTextField nameText = new JTextField(20);
        nameText.setBounds(100, 60, 165, 25);
        panel.add(nameText);

        // Email label
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(10, 100, 80, 25);
        panel.add(emailLabel);

        // Email text field
        JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 100, 165, 25);
        panel.add(emailText);

        // Password label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 140, 80, 25);
        panel.add(passwordLabel);

        // Password text field
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 140, 165, 25);
        panel.add(passwordText);

        // Chart button
        JButton chartButton = new JButton("Chart");
        chartButton.setBounds(10, 180, 80, 25);
        panel.add(chartButton);

        // Back button
        JButton backButton = new JButton("Back");
        backButton.setBounds(100, 180, 80, 25);
        panel.add(backButton);

        // Sign Up button
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(190, 180, 80, 25);
        panel.add(signUpButton);
    }
}
