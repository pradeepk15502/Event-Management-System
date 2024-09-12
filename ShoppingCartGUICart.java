import java.awt.*;
import javax.swing.*;

public class ShoppingCartGUICart {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Shopping Cart System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Create top panel for navigation buttons
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton homeButton = new JButton("Home");
        JButton viewProductButton = new JButton("View Product");
        JButton requestItemButton = new JButton("Request Item");
        JButton productStatusButton = new JButton("Product Status");
        JButton logOutButton = new JButton("LogOut");

        topPanel.add(homeButton);
        topPanel.add(viewProductButton);
        topPanel.add(requestItemButton);
        topPanel.add(productStatusButton);
        topPanel.add(logOutButton);

        // Create panel for shopping cart
        JPanel cartPanel = new JPanel();
        cartPanel.setLayout(new BorderLayout());

        JLabel cartTitle = new JLabel("Shopping Cart", SwingConstants.CENTER);
        cartTitle.setFont(new Font("Arial", Font.BOLD, 16));
        cartPanel.add(cartTitle, BorderLayout.NORTH);

        // Create table for cart items
        String[] columnNames = {"Image", "Name", "Price", "Quantity", "Total Price", "Action"};
        Object[][] data = {
            {"Image", "Product Name", "$100", "2", "$200", "Remove"}
        };

        JTable cartTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(cartTable);
        cartPanel.add(scrollPane, BorderLayout.CENTER);

        // Create bottom panel for grand total and buttons
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JLabel grandTotalLabel = new JLabel("Grand Total: $200");
        JButton proceedToCheckoutButton = new JButton("Proceed to Checkout");
        JButton deleteAllButton = new JButton("Delete All");

        bottomPanel.add(grandTotalLabel);
        bottomPanel.add(proceedToCheckoutButton);
        bottomPanel.add(deleteAllButton);

        // Add components to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(cartPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Display the frame
        frame.setVisible(true);
    }
}
