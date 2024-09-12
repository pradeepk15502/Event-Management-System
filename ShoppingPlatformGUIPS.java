import java.awt.*;
import javax.swing.*;

public class ShoppingPlatformGUIPS {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Shopping Platform");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Create top panel for Home, Products, and LogOut buttons
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton homeButton = new JButton("Home");
        JButton productsButton = new JButton("Products");
        JButton logOutButton = new JButton("LogOut");
        JLabel vendorLabel = new JLabel("Vendor Name", SwingConstants.CENTER);

        topPanel.add(homeButton);
        topPanel.add(productsButton);
        topPanel.add(vendorLabel);
        topPanel.add(logOutButton);

        // Create panel for product buttons
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(2, 4, 10, 10)); // 2 rows, 4 columns, with gaps

        // Add product buttons and their sub-buttons
        for (int i = 1; i <= 4; i++) {
            JPanel productSubPanel = new JPanel();
            productSubPanel.setLayout(new BoxLayout(productSubPanel, BoxLayout.Y_AXIS));
            JLabel productLabel = new JLabel("Product " + i);
            JLabel priceLabel = new JLabel("Price");
            JButton addToCartButton = new JButton("Add to Cart");

            productSubPanel.add(productLabel);
            productSubPanel.add(priceLabel);
            productSubPanel.add(addToCartButton);

            productPanel.add(productSubPanel);
        }

        // Add components to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(productPanel, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
