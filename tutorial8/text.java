import java.awt.*;
import javax.swing.*;
public class text extends JFrame {
    private final JTextArea textArea = new JTextArea();

    public text() {
        setTitle("Simple Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 450);
        setLocationRelativeTo(null);
        setJMenuBar(createMenuBar());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        newItem.addActionListener(event -> textArea.setText(""));
        JMenuItem clearItem = new JMenuItem("Clear");
        clearItem.addActionListener(event -> textArea.setText(""));
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(event -> dispose());
        fileMenu.add(newItem);
        fileMenu.add(clearItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JMenu editMenu = new JMenu("Edit");
        addEditItem(editMenu, "Cut", event -> textArea.cut());
        addEditItem(editMenu, "Copy", event -> textArea.copy());
        addEditItem(editMenu, "Paste", event -> textArea.paste());
        addEditItem(editMenu, "Select All", event -> textArea.selectAll());
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        return menuBar;
    }

    private void addEditItem(JMenu menu, String title,
            java.awt.event.ActionListener listener) {
        JMenuItem item = new JMenuItem(title);
        item.addActionListener(listener);
        menu.add(item);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new text().setVisible(true));
    }
}