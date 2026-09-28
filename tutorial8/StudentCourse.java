import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentCourse extends JFrame {
    private final JTextField studentNameField = new JTextField(15);
    private final DefaultListModel<String> courseModel = new DefaultListModel<>();
    private final JList<String> courseList = new JList<>(courseModel);
    private final DefaultTableModel tableModel = new DefaultTableModel(
            new String[]{"Student Name", "Selected Course", "Enrollment Status"}, 0);

    public StudentCourse() {
        setTitle("Student Course Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);

        courseModel.addElement("Java Programming");
        courseModel.addElement("Database Management");
        courseModel.addElement("Web Development");
        courseModel.addElement("Data Structures");
        courseList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JTable registrationTable = new JTable(tableModel);
        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controls.add(new JLabel("Student name:"));
        controls.add(studentNameField);
        JButton addButton = new JButton("Add Registration");
        addButton.addActionListener(event -> addRegistration());
        JButton removeButton = new JButton("Remove Selected");
        removeButton.addActionListener(event -> removeRegistration(registrationTable));
        controls.add(addButton);
        controls.add(removeButton);

        add(controls, BorderLayout.NORTH);
        add(new JScrollPane(courseList), BorderLayout.WEST);
        add(new JScrollPane(registrationTable), BorderLayout.CENTER);
    }

    private void addRegistration() {
        String studentName = studentNameField.getText().trim();
        String course = courseList.getSelectedValue();
        if (studentName.isEmpty() || course == null) {
            JOptionPane.showMessageDialog(this, "Enter a student name and select a course.",
                    "Missing Information", JOptionPane.WARNING_MESSAGE);
            return;
        }
        tableModel.addRow(new Object[]{studentName, course, "Enrolled"});
        studentNameField.setText("");
    }

    private void removeRegistration(JTable registrationTable) {
        int selectedRow = registrationTable.getSelectedRow();
        if (selectedRow >= 0) {
            tableModel.removeRow(selectedRow);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentCourse().setVisible(true));
    }
}