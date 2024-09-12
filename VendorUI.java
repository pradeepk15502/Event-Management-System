import java.awt.*;
import javax.swing.*;

public class VendorUI {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Vendor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Create a panel for the header buttons (Home, Request Item, LogOut)
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(1, 3));

        JButton homeButton = new JButton("Home");
        JButton requestItemButton = new JButton("Request Item");
        JButton logOutButton = new JButton("LogOut");

        headerPanel.add(homeButton);
        headerPanel.add(requestItemButton);
        headerPanel.add(logOutButton);

        // Create a panel for the items (Item 1, Item 2, Item 3, Item 4)
        JPanel itemsPanel = new JPanel();
        itemsPanel.setLayout(new GridLayout(1, 4, 10, 10)); // 1 row, 4 columns, 10px gap

        JButton item1Button = new JButton("Item 1");
        JButton item2Button = new JButton("Item 2");
        JButton item3Button = new JButton("Item 3");
        JButton item4Button = new JButton("Item 4");

        itemsPanel.add(item1Button);
        itemsPanel.add(item2Button);
        itemsPanel.add(item3Button);
        itemsPanel.add(item4Button);

        // Add the panels to the frame
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(itemsPanel, BorderLayout.CENTER);

        // Set the frame visibility
        frame.setVisible(true);
    }
}
