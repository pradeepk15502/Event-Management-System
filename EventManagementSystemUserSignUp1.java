import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventManagementSystemUserSignUp1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel title = new JLabel("Event Management System");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(title, gbc);
        
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(nameLabel, gbc);
        
        JTextField nameText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(nameText, gbc);
        
        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(emailLabel, gbc);
        
        JTextField emailText = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(emailText, gbc);
        
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(passwordLabel, gbc);
        
        JPasswordField passwordText = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(passwordText, gbc);
        
        JButton chartButton = new JButton("Chart");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(chartButton, gbc);
        
        JButton backButton = new JButton("Back");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(backButton, gbc);
        
        JButton signUpButton = new JButton("Sign Up");
        gbc.gridx = 2;
        gbc.gridy = 4;
        panel.add(signUpButton, gbc);
        
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Sign Up logic here
                JOptionPane.showMessageDialog(null, "Sign Up button clicked!");
            }
        });

        chartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Chart logic here
                JOptionPane.showMessageDialog(null, "Chart button clicked!");
            }
        });
        
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle Back logic here
                JOptionPane.showMessageDialog(null, "Back button clicked!");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
