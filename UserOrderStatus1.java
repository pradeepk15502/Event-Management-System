import java.awt.*;
import javax.swing.*;

public class UserOrderStatus1 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("User Order Status");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(null); // Setting layout as null to manually position components

        // Create buttons
        JButton homeButton = new JButton("Home");
        homeButton.setBounds(50, 50, 100, 50); // Setting position and size
        JButton logoutButton = new JButton("LogOut");
        logoutButton.setBounds(450, 50, 100, 50);

        JButton nameButton = new JButton("Name");
        nameButton.setBounds(50, 200, 100, 50);
        JButton emailButton = new JButton("E-mail");
        emailButton.setBounds(200, 200, 100, 50);
        JButton addressButton = new JButton("Address");
        addressButton.setBounds(350, 200, 100, 50);
        JButton statusButton = new JButton("Status");
        statusButton.setBounds(500, 200, 100, 50);

        // Create a label for User Order Status
        JLabel userOrderLabel = new JLabel("User Order Status", SwingConstants.CENTER);
        userOrderLabel.setOpaque(true);
        userOrderLabel.setBackground(Color.LIGHT_GRAY);
        userOrderLabel.setBounds(200, 100, 200, 50); // Center the label

        // Adding components to the frame
        frame.add(homeButton);
        frame.add(logoutButton);
        frame.add(nameButton);
        frame.add(emailButton);
        frame.add(addressButton);
        frame.add(statusButton);
        frame.add(userOrderLabel);

        // Set background color for the frame
        frame.getContentPane().setBackground(Color.GRAY);

        // Make the frame visible
        frame.setVisible(true);
    }
}