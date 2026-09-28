import java.awt.*;
import javax.swing.*;

public class StudentRegister extends JFrame {
    private final JTextField nameField = new JTextField();
    private final JTextField registerNumberField = new JTextField();
    private final JRadioButton maleButton = new JRadioButton("Male");
    private final JRadioButton femaleButton = new JRadioButton("Female");
    private final JComboBox<String> departmentBox = new JComboBox<>(new String[]{
            "Computer Science", "Information Technology", "Electronics", "Mechanical"
    });

    public StudentRegister() {
        setTitle("Student Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 250);
        setLocationRelativeTo(null);

        JPanel form = new JPanel(new GridLayout(5, 2, 8, 8));
        form.add(new JLabel("Student name:"));
        form.add(nameField);
        form.add(new JLabel("Register number:"));
        form.add(registerNumberField);
        form.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        form.add(genderPanel);
        form.add(new JLabel("Department:"));
        form.add(departmentBox);
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(event -> showRegistration());
        form.add(new JLabel());
        form.add(submitButton);
        add(form);
    }

    private void showRegistration() {
        String gender = maleButton.isSelected() ? "Male"
                : femaleButton.isSelected() ? "Female" : "Not selected";
        String message = "Name: " + nameField.getText()
                + "\nRegister number: " + registerNumberField.getText()
                + "\nGender: " + gender
                + "\nDepartment: " + departmentBox.getSelectedItem();
        JOptionPane.showMessageDialog(this, message, "Registration Details",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentRegister().setVisible(true));
    }
}