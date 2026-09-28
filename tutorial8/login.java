import java.awt.*;
import javax.swing.*;

public class login extends JFrame {
    private final JTextField usernameField = new JTextField();
    private final JPasswordField passwordField = new JPasswordField();
    private final JCheckBox rememberMeBox = new JCheckBox("Remember Me");
    private final JCheckBox notificationsBox = new JCheckBox("Receive Notifications");

    public login() {
        setTitle("User Login and Preferences");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 240);
        setLocationRelativeTo(null);

        JPanel form = new JPanel(new GridLayout(4, 2, 8, 8));
        form.add(new JLabel("Username:"));
        form.add(usernameField);
        form.add(new JLabel("Password:"));
        form.add(passwordField);
        form.add(rememberMeBox);
        form.add(notificationsBox);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(event -> login());
        form.add(new JLabel());
        form.add(loginButton);
        add(form);
    }

    private void login() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());
        String message = username.isEmpty() || password.isEmpty()
                ? "Please enter both username and password."
                : "Login successful for " + username + ".\nRemember Me: "
                + rememberMeBox.isSelected() + "\nReceive Notifications: "
                + notificationsBox.isSelected();
        JOptionPane.showMessageDialog(this, message, "Login",
                username.isEmpty() || password.isEmpty()
                        ? JOptionPane.WARNING_MESSAGE : JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new login().setVisible(true));
    }
}