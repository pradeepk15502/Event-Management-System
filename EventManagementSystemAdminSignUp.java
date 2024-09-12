import java.awt.*;
import javax.swing.*;

public class EventManagementSystemAdminSignUp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        
        JLabel categoryLabel = new JLabel("Category:");
        String[] categories = {"Catering", "Florist", "Decoration", "Lighting"};
        JComboBox<String> categoryBox = new JComboBox<>(categories);
        JButton signUpButton = new JButton("Sign Up");
        
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(categoryLabel);
        panel.add(categoryBox);
        panel.add(new JLabel()); // Empty cell
        panel.add(signUpButton);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}