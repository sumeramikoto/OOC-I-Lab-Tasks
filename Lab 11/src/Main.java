import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Main extends JFrame {
    private JTextField titleTextField;
    private JTextField authorTextField;
    private JTextField genreTextField;
    private JComboBox statusComboBox;
    private JButton addButton;
    private JButton viewAllButton;
    private JPanel panel1;
    private JLabel titleLabel;
    private JLabel authorLabel;
    private JLabel genreLabel;
    private JLabel statusLabel;
    private JTable table;

    public Main() {
        setContentPane(panel1);
        setTitle("Add a book");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 240);
        setVisible(true);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addInfo();
            }
        });
        viewAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                viewInfo();
            }
        });
    }

    public void addInfo() {
        try (FileWriter writer = new FileWriter(new File("info.csv"), true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(titleTextField.getText()).append(",");
            sb.append(authorTextField.getText()).append(",");
            sb.append(genreTextField.getText()).append(",");
            sb.append(statusComboBox.getSelectedItem());

            writer.write(sb.toString() + "\n");
            writer.close();
            JOptionPane.showMessageDialog(this, "You've added a book to the list!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    public void viewInfo() {
        try (Scanner scanner = new Scanner(new File("info.csv"))) {
            DefaultTableModel model = new DefaultTableModel();
            String[] headers = {"Title", "Author", "Genre", "Status"};
            model.setColumnIdentifiers(headers);

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                model.addRow(data);
            }

            table = new JTable(model);
            JOptionPane.showMessageDialog(this, new JScrollPane(table));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}