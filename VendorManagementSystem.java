import javax.swing.*;
import java.awt.*;

public class VendorManagementSystem {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Vendor Management System");
        frame.setSize(400, 200);
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
        JLabel title = new JLabel("Welcome Vendor", SwingConstants.CENTER);
        title.setBounds(10, 10, 360, 25);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(title);

        // Your Item button
        JButton yourItemButton = new JButton("Your Item");
        yourItemButton.setBounds(20, 60, 100, 25);
        panel.add(yourItemButton);

        // Add New Item button
        JButton addNewItemButton = new JButton("Add New Item");
        addNewItemButton.setBounds(130, 60, 120, 25);
        panel.add(addNewItemButton);

        // Transaction button
        JButton transactionButton = new JButton("Transaction");
        transactionButton.setBounds(260, 60, 100, 25);
        panel.add(transactionButton);

        // LogOut button
        JButton logoutButton = new JButton("LogOut");
        logoutButton.setBounds(150, 100, 100, 25);
        panel.add(logoutButton);
    }
}
