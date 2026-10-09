import javax.swing.*;
import java.awt.event.*;

public class ServiceCostEstimator extends JFrame implements ActionListener {
    JTextField regField;
    JComboBox<String> typeBox;
    JCheckBox generalBox, oilBox, brakeBox, batteryBox;
    JButton calcButton;
    JLabel resultLabel;

    ServiceCostEstimator() {
        setTitle("Service Cost Estimator");
        setSize(380, 380);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel regLabel = new JLabel("Vehicle Reg. No:");
        regLabel.setBounds(20, 20, 120, 25);
        add(regLabel);
        regField = new JTextField();
        regField.setBounds(150, 20, 190, 25);
        add(regField);

        JLabel typeLabel = new JLabel("Vehicle Type:");
        typeLabel.setBounds(20, 60, 120, 25);
        add(typeLabel);
        typeBox = new JComboBox<>(new String[] {"Two Wheeler", "Car"});
        typeBox.setBounds(150, 60, 190, 25);
        add(typeBox);

        JLabel serviceLabel = new JLabel("Select Services:");
        serviceLabel.setBounds(20, 100, 150, 25);
        add(serviceLabel);

        generalBox = new JCheckBox("General Service - Rs. 1000");
        generalBox.setBounds(40, 130, 250, 25);
        add(generalBox);
        oilBox = new JCheckBox("Oil Change - Rs. 800");
        oilBox.setBounds(40, 160, 250, 25);
        add(oilBox);
        brakeBox = new JCheckBox("Brake Service - Rs. 1200");
        brakeBox.setBounds(40, 190, 250, 25);
        add(brakeBox);
        batteryBox = new JCheckBox("Battery Check - Rs. 500");
        batteryBox.setBounds(40, 220, 250, 25);
        add(batteryBox);

        calcButton = new JButton("Calculate Cost");
        calcButton.setBounds(100, 265, 160, 30);
        calcButton.addActionListener(this);
        add(calcButton);

        resultLabel = new JLabel("Total Cost: Rs. 0");
        resultLabel.setBounds(20, 310, 330, 25);
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        if (generalBox.isSelected()) total += 1000;
        if (oilBox.isSelected()) total += 800;
        if (brakeBox.isSelected()) total += 1200;
        if (batteryBox.isSelected()) total += 500;

        resultLabel.setText(regField.getText() + " (" + typeBox.getSelectedItem()
                + ") Total Cost: Rs. " + total);
    }

    public static void main(String[] args) {
        new ServiceCostEstimator();
    }
}