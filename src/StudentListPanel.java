import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentListPanel extends JPanel {
    static String[] headers = {"ID", "Name", "Surname"};
    static DefaultTableModel model = new DefaultTableModel(headers, 0);
    public StudentListPanel() {
        JTable table = new JTable();
        model.setColumnIdentifiers(headers);
        for (Student student : Student.list) {
                addRow(student);
        }
    }
}
