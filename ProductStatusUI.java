import java.awt.*;
import javax.swing.*;

public class ProductStatusUI {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Product Status");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new BorderLayout());

        // Create a panel for the header
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton productStatusButton = new JButton("Product Status");
        headerPanel.add(productStatusButton);

        // Create a panel for the navigation buttons (Home, LogOut)
        JPanel navPanel = new JPanel();
        navPanel.setLayout(new GridLayout(1, 2));

        JButton homeButton = new JButton("Home");
        JButton logOutButton = new JButton("LogOut");

        navPanel.add(homeButton);
        navPanel.add(logOutButton);

        // Create a panel for the content buttons (Name, E-Mail, Address, etc.)
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 6, 10, 10)); // 2 rows, 6 columns, 10px gaps

        JButton nameButton = new JButton("Name");
        JButton emailButton = new JButton("E-Mail");
        JButton addressButton = new JButton("Address");
        JButton statusButton = new JButton("Status");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        JButton row2Button1 = new JButton(""); // Empty buttons for spacing
        JButton row2Button2 = new JButton("");
        JButton row2Button3 = new JButton("");
        JButton row2Button4 = new JButton("");
        JButton row2Button5 = new JButton("");
        JButton row2Button6 = new JButton("");

        contentPanel.add(nameButton);
        contentPanel.add(emailButton);
        contentPanel.add(addressButton);
        contentPanel.add(statusButton);
        contentPanel.add(updateButton);
        contentPanel.add(deleteButton);
        contentPanel.add(row2Button1);
        contentPanel.add(row2Button2);
        contentPanel.add(row2Button3);
        contentPanel.add(row2Button4);
        contentPanel.add(row2Button5);
        contentPanel.add(row2Button6);

        // Add panels to the frame
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(navPanel, BorderLayout.WEST);
        frame.add(contentPanel, BorderLayout.CENTER);

        // Set frame visibility
        frame.setVisible(true);
    }
}
