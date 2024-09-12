import java.awt.*;
import javax.swing.*;

public class UserInterface {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Membership and User Management");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);

        // Top panel for "Home" and "LogOut" buttons
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        JButton homeButton = new JButton("Home");
        homeButton.setBackground(Color.WHITE);
        homeButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        JButton logoutButton = new JButton("LogOut");
        logoutButton.setBackground(Color.WHITE);
        logoutButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        topPanel.add(homeButton, BorderLayout.WEST);
        topPanel.add(logoutButton, BorderLayout.EAST);

        // Left panel for "Membership" and "User Management"
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton membershipButton = new JButton("Membership");
        membershipButton.setBackground(Color.WHITE);
        membershipButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        JButton userManagementButton = new JButton("User Management");
        userManagementButton.setBackground(Color.WHITE);
        userManagementButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        leftPanel.add(membershipButton);
        leftPanel.add(userManagementButton);

        // Center panel for "Add" and "Update" buttons
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2, 10, 10));

        JButton addMembershipButton = new JButton("Add");
        addMembershipButton.setBackground(Color.WHITE);
        addMembershipButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        JButton updateMembershipButton = new JButton("Update");
        updateMembershipButton.setBackground(Color.WHITE);
        updateMembershipButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        JButton addUserButton = new JButton("Add");
        addUserButton.setBackground(Color.WHITE);
        addUserButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        JButton updateUserButton = new JButton("Update");
        updateUserButton.setBackground(Color.WHITE);
        updateUserButton.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        centerPanel.add(addMembershipButton);
        centerPanel.add(updateMembershipButton);
        centerPanel.add(addUserButton);
        centerPanel.add(updateUserButton);

        // Add panels to the main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Add main panel to the frame
        frame.add(mainPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}