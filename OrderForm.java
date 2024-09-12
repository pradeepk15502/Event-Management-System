import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    
public class OrderForm extends JFrame {

    // Constructor to set up the GUI
    public OrderForm() {
        setTitle("Order Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout manager
        setLayout(new GridLayout(8, 2, 10, 10)); // 8 rows, 2 columns, padding of 10px

        // Create labels and text fields
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
        String[] paymentOptions = {"Cash", "UPI"};
        JComboBox<String> paymentDropdown = new JComboBox<>(paymentOptions);

        // Add an "Order Now" button
        JButton orderButton = new JButton("Order Now");

        // Add action listener to the button
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Simple action to display input values in a message dialog
                String name = nameField.getText();
                String email = emailField.getText();
                String address = addressField.getText();
                String city = cityField.getText();
                String number = numberField.getText();
                String state = stateField.getText();
                String pinCode = pinCodeField.getText();
                String paymentMethod = (String) paymentDropdown.getSelectedItem();

                JOptionPane.showMessageDialog(null, "Order Details:\n"
                        + "Name: " + name + "\n"
                        + "Email: " + email + "\n"
                        + "Address: " + address + "\n"
                        + "City: " + city + "\n"
                        + "Number: " + number + "\n"
                        + "State: " + state + "\n"
                        + "Pin Code: " + pinCode + "\n"
                        + "Payment Method: " + paymentMethod, "Order Summary", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add components to the frame
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
        add(paymentDropdown);

        // Span the button across two columns
        add(new JLabel()); // Empty label to adjust layout
        add(orderButton);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new OrderForm(); // Run the application
    }
}
