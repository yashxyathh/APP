import javax.swing.*;
import java.awt.event.*;

public class StudentGradeCalculator implements ActionListener {

    JFrame frame;
    JTextField nameField, sub1Field, sub2Field, sub3Field;
    JLabel totalLabel, averageLabel, gradeLabel;
    JButton calculateButton;

    StudentGradeCalculator() {
        frame = new JFrame("Student Grade Calculator");

        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(30, 30, 120, 25);
        nameField = new JTextField();
        nameField.setBounds(160, 30, 150, 25);

        JLabel sub1Label = new JLabel("Subject 1 Marks:");
        sub1Label.setBounds(30, 70, 120, 25);
        sub1Field = new JTextField();
        sub1Field.setBounds(160, 70, 150, 25);

        JLabel sub2Label = new JLabel("Subject 2 Marks:");
        sub2Label.setBounds(30, 110, 120, 25);
        sub2Field = new JTextField();
        sub2Field.setBounds(160, 110, 150, 25);

        JLabel sub3Label = new JLabel("Subject 3 Marks:");
        sub3Label.setBounds(30, 150, 120, 25);
        sub3Field = new JTextField();
        sub3Field.setBounds(160, 150, 150, 25);

        calculateButton = new JButton("Calculate Result");
        calculateButton.setBounds(90, 195, 160, 30);
        calculateButton.addActionListener(this);

        totalLabel = new JLabel("Total: ");
        totalLabel.setBounds(30, 245, 250, 25);
        averageLabel = new JLabel("Average: ");
        averageLabel.setBounds(30, 275, 250, 25);
        gradeLabel = new JLabel("Grade: ");
        gradeLabel.setBounds(30, 305, 250, 25);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(sub1Label);
        frame.add(sub1Field);
        frame.add(sub2Label);
        frame.add(sub2Field);
        frame.add(sub3Label);
        frame.add(sub3Field);
        frame.add(calculateButton);
        frame.add(totalLabel);
        frame.add(averageLabel);
        frame.add(gradeLabel);

        frame.setSize(360, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int m1 = Integer.parseInt(sub1Field.getText());
        int m2 = Integer.parseInt(sub2Field.getText());
        int m3 = Integer.parseInt(sub3Field.getText());

        int total = m1 + m2 + m3;
        double average = total / 3.0;
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        totalLabel.setText("Total: " + total);
        averageLabel.setText("Average: " + String.format("%.2f", average));
        gradeLabel.setText("Grade: " + grade);
    }

    public static void main(String[] args) {
        new StudentGradeCalculator();
    }
}