package view.course;

import model.Student;
import view.student.AddStudentPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCoursePanel extends JPanel {
    public AddCoursePanel() {
        JTextField name = new JTextField(10);
        JTextField surname = new JTextField(10);

        JButton addStudentButton = new JButton("Добавить");

        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!name.getText().isEmpty() && !surname.getText().isEmpty()) {
                    new Student(name.getText(), surname.getText());
                    name.setText("");
                    surname.setText("");
                }
            }
        });

        add(name);
        add(surname);
        add(addStudentButton);
        setVisible(true);
    }
}
