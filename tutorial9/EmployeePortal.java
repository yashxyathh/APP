import javax.swing.*;
import java.awt.*;

public class EmployeePortal extends JFrame {
    String password = "admin123";

    JTextField user = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);

    EmployeePortal() {
        setTitle("Login Window");
        setSize(300, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel p = new JPanel();
        p.add(new JLabel("Username:"));
        p.add(user);
        p.add(new JLabel("Password:"));
        p.add(pass);

        JButton login = new JButton("Login");
        p.add(login);
        add(p);

        login.addActionListener(e -> {
            if (user.getText().equals("admin") &&
                new String(pass.getPassword()).equals(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                mainWindow();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials!");
            }
        });

        setVisible(true);
    }

    void mainWindow() {
        JFrame f = new JFrame("Employee Management Portal");
        f.setSize(500, 300);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JMenuBar bar = new JMenuBar();
        JMenu emp = new JMenu("Employee");
        JMenu tools = new JMenu("Tools");
        JMenu exit = new JMenu("Exit");

        JMenuItem add = new JMenuItem("Add Employee");
        JMenuItem view = new JMenuItem("View Employee");
        JMenuItem change = new JMenuItem("Change Password");
        JMenuItem logout = new JMenuItem("Logout");
        JMenuItem close = new JMenuItem("Exit Application");

        emp.add(add);
        emp.add(view);
        tools.add(change);
        exit.add(logout);
        exit.add(close);

        bar.add(emp);
        bar.add(tools);
        bar.add(exit);
        f.setJMenuBar(bar);
        f.add(new JLabel("Welcome to Employee Management Portal",
                SwingConstants.CENTER));

        add.addActionListener(e -> {
            JTextField id = new JTextField();
            JTextField name = new JTextField();
            JTextField dept = new JTextField();

            Object[] fields = {"Employee ID:", id,
                    "Employee Name:", name, "Department:", dept};

            int result = JOptionPane.showConfirmDialog(f, fields,
                    "Add Employee", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION)
                JOptionPane.showMessageDialog(f, "Employee Added!\n"
                        + id.getText() + "\n" + name.getText()
                        + "\n" + dept.getText());
        });

        view.addActionListener(e ->
                JOptionPane.showMessageDialog(f, "No employee records available."));

        change.addActionListener(e -> {
            JPasswordField old = new JPasswordField();
            JPasswordField n = new JPasswordField();
            JPasswordField c = new JPasswordField();

            Object[] fields = {"Old Password:", old,
                    "New Password:", n, "Confirm Password:", c};

            int result = JOptionPane.showConfirmDialog(f, fields,
                    "Change Password", JOptionPane.OK_CANCEL_OPTION);

            if (result == JOptionPane.OK_OPTION) {
                if (new String(old.getPassword()).equals(password)
                        && new String(n.getPassword()).equals(
                                new String(c.getPassword()))
                        && n.getPassword().length > 0) {
                    password = new String(n.getPassword());
                    JOptionPane.showMessageDialog(f,
                            "Password Changed Successfully!");
                } else {
                    JOptionPane.showMessageDialog(f,
                            "Invalid old password or passwords do not match!");
                }
            }
        });

        logout.addActionListener(e -> {
            f.dispose();
            user.setText("");
            pass.setText("");
            setVisible(true);
        });

        close.addActionListener(e -> System.exit(0));

        setVisible(false);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeePortal();
    }
}