import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThankYouPopup extends JFrame {

    // Constructor to set up the GUI
    public ThankYouPopup() {
        setTitle("Thank You");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout manager
        setLayout(new GridLayout(8, 2, 10, 10)); // 8 rows, 2 columns, 10px padding

        // Add components
        JLabel thankYouLabel = new JLabel("THANK YOU", SwingConstants.CENTER);
        thankYouLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel totalAmountLabel = new JLabel("Total Amount:", SwingConstants.CENTER);
        JButton totalAmountButton = new JButton("Total Amount"); // Placeholder for total amount

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("E-mail:");
        JTextField emailField = new JTextField();

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        JLabel cityLabel = new JLabel("City:");
        JTextField cityField = new JTextField();

        JLabel numberLabel = new JLabel("Number:");
        JTextField numberField = new JTextField();

        JLabel stateLabel = new JLabel("State:");
        JTextField stateField = new JTextField();

        JLabel pinCodeLabel = new JLabel("Pin Code:");
        JTextField pinCodeField = new JTextField();

        JLabel paymentLabel = new JLabel("Payment Method:");
        JTextField paymentMethodField = new JTextField();

        // "Continue Shopping" button
        JButton continueShoppingButton = new JButton("Continue Shopping");
        continueShoppingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action on click (e.g., go back to main menu)
                JOptionPane.showMessageDialog(null, "Continuing shopping...", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add components to the frame in the correct layout
        add(thankYouLabel);
        add(new JLabel()); // Empty space for alignment

        add(totalAmountLabel);
        add(totalAmountButton);

        add(nameLabel);
        add(nameField);

        add(emailLabel);
        add(emailField);

        add(addressLabel);
        add(addressField);

        add(cityLabel);
        add(cityField);

        add(numberLabel);
        add(numberField);

        add(stateLabel);
        add(stateField);

        add(pinCodeLabel);
        add(pinCodeField);

        add(paymentLabel);
        add(paymentMethodField);

        add(new JLabel()); // Empty space for layout adjustment
        add(continueShoppingButton);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new ThankYouPopup(); // Run the application
    }
}
