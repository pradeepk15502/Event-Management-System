import java.awt.*;
import javax.swing.*;

public class ShoppingPlatformGUI {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Shopping Platform");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Create top panel for Home and LogOut buttons
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton homeButton = new JButton("Home");
        JButton logOutButton = new JButton("LogOut");
        topPanel.add(homeButton);
        topPanel.add(logOutButton);

        // Create panel for vendor buttons
        JPanel vendorPanel = new JPanel();
        vendorPanel.setLayout(new GridLayout(2, 4, 10, 10)); // 2 rows, 4 columns, with gaps

        // Add vendor buttons and their sub-buttons
        for (int i = 1; i <= 4; i++) {
            JPanel vendorSubPanel = new JPanel();
            vendorSubPanel.setLayout(new BoxLayout(vendorSubPanel, BoxLayout.Y_AXIS));
            JButton vendorButton = new JButton("Vendor " + i);
            JButton contactDetailsButton = new JButton("Contact Details");
            JButton shopItemButton = new JButton("Shop Item");

            vendorSubPanel.add(vendorButton);
            vendorSubPanel.add(contactDetailsButton);
            vendorSubPanel.add(shopItemButton);

            vendorPanel.add(vendorSubPanel);
        }

        // Create panel for LogOut button
        JPanel logOutPanel = new JPanel();
        logOutPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        logOutPanel.add(logOutButton);
        logOutPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Add padding

        // Add components to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(vendorPanel, BorderLayout.CENTER);
        frame.add(logOutPanel, BorderLayout.SOUTH);

        // Display the frame
        frame.setVisible(true);
    }
}
