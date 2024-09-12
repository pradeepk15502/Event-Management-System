import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StateChangeUI {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("State Update");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Create Home and LogOut buttons
        JButton homeButton = new JButton("Home");
        JButton logOutButton = new JButton("LogOut");

        // Create a panel for the main center content
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(Color.LIGHT_GRAY);

        // Create a border for the center panel
        JPanel updatePanel = new JPanel();
        updatePanel.setLayout(new BoxLayout(updatePanel, BoxLayout.Y_AXIS));
        updatePanel.setBorder(BorderFactory.createTitledBorder("Update"));
        updatePanel.setBackground(Color.BLUE);

        // Create radio buttons for the state options
        JRadioButton receivedButton = new JRadioButton("Received");
        JRadioButton shippingButton = new JRadioButton("Ready for Shipping");
        JRadioButton deliveryButton = new JRadioButton("Out For Delivery");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(receivedButton);
        group.add(shippingButton);
        group.add(deliveryButton);

        // Add radio buttons to the update panel
        updatePanel.add(receivedButton);
        updatePanel.add(shippingButton);
        updatePanel.add(deliveryButton);

        // Create an Update button
        JButton updateButton = new JButton("Update");

        // Add action listener to the Update button
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String state = "";
                if (receivedButton.isSelected()) {
                    state = "Received";
                } else if (shippingButton.isSelected()) {
                    state = "Ready for Shipping";
                } else if (deliveryButton.isSelected()) {
                    state = "Out For Delivery";
                }

                JOptionPane.showMessageDialog(frame, "State will Change to: " + state);
            }
        });

        // Add the components to the center panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        centerPanel.add(updatePanel, gbc);

        gbc.gridy = 1;
        centerPanel.add(updateButton, gbc);

        // Add the Home and LogOut buttons to the frame
        frame.add(homeButton, BorderLayout.WEST);
        frame.add(logOutButton, BorderLayout.EAST);
        frame.add(centerPanel, BorderLayout.CENTER);

        // Set frame visibility
        frame.setVisible(true);
    }
}
