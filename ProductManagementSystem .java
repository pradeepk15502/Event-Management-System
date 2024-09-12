import javax.swing.*;
import java.awt.*;

public class ProductManagementSystemAddIte {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Product Management System");
        frame.setSize(500, 400);
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
        JLabel title = new JLabel("Welcome 'VendorName'", SwingConstants.CENTER);
        title.setBounds(10, 10, 460, 25);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(title);

        // Product Name label
        JLabel nameLabel = new JLabel("Product Name");
        nameLabel.setBounds(10, 60, 100, 25);
        panel.add(nameLabel);

        // Product Name text field
        JTextField nameText = new JTextField(20);
        nameText.setBounds(120, 60, 165, 25);
        panel.add(nameText);

        // Product Price label
        JLabel priceLabel = new JLabel("Product Price");
        priceLabel.setBounds(10, 100, 100, 25);
        panel.add(priceLabel);

        // Product Price text field
        JTextField priceText = new JTextField(20);
        priceText.setBounds(120, 100, 165, 25);
        panel.add(priceText);

        // Product Image label
        JLabel imageLabel = new JLabel("Product Image");
        imageLabel.setBounds(10, 140, 100, 25);
        panel.add(imageLabel);

        // Product Image text field
        JTextField imageText = new JTextField(20);
        imageText.setBounds(120, 140, 165, 25);
        panel.add(imageText);

        // Add The Product button
        JButton addButton = new JButton("Add The Product");
        addButton.setBounds(10, 180, 150, 25);
        panel.add(addButton);

        // Delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(170, 180, 80, 25);
        panel.add(deleteButton);

        // Update button
        JButton updateButton = new JButton("Update");
        updateButton.setBounds(260, 180, 80, 25);
        panel.add(updateButton);
    }
}
