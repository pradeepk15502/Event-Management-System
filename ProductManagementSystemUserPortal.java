import java.awt.*;
import javax.swing.*;

public class ProductManagementSystemUserPortal {
    
   
   
        public static void main(String[] args) {
            // Create frame
            JFrame frame = new JFrame("Event Management System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new BorderLayout());
    
            // Create menu bar and add items
            JMenuBar menuBar = new JMenuBar();
            JMenu vendorMenu = new JMenu("Vendor");
            JMenuItem cateringItem = new JMenuItem("Catering");
            JMenuItem floristItem = new JMenuItem("Florist");
            JMenuItem decorationItem = new JMenuItem("Decoration");
            JMenuItem lightingItem = new JMenuItem("Lighting");
    
            vendorMenu.add(cateringItem);
            vendorMenu.add(floristItem);
            vendorMenu.add(decorationItem);
            vendorMenu.add(lightingItem);
    
            menuBar.add(vendorMenu);
    
            // Create welcome label
            JLabel welcomeLabel = new JLabel("WELCOME USER", SwingConstants.CENTER);
    
            // Create buttons
            JButton vendorButton = new JButton("Vendor");
            JButton cartButton = new JButton("Cart");
            JButton guestListButton = new JButton("Guest List");
            JButton orderStatusButton = new JButton("Order Status");
            JButton logOutButton = new JButton("LogOut");
    
            // Create panel for buttons
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(1, 4));
            buttonPanel.add(vendorButton);
            buttonPanel.add(cartButton);
            buttonPanel.add(guestListButton);
            buttonPanel.add(orderStatusButton);
    
            // Create panel for logout button with padding
            JPanel logOutPanel = new JPanel();
            logOutPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            logOutPanel.add(logOutButton);
            logOutPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Add padding
    
            // Add components to frame
            frame.setJMenuBar(menuBar);
            frame.add(welcomeLabel, BorderLayout.NORTH);
            frame.add(buttonPanel, BorderLayout.CENTER);
            frame.add(logOutPanel, BorderLayout.SOUTH);
    
            // Display the frame
            frame.setVisible(true);
        }
    }
    