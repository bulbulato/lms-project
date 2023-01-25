package view;

import view.student.AddStudentPanel;
import view.student.StudentListPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("LMS");
//      устанавливаем размер
        setSize(500, 500);
//        устанавливаем локацию
        setLocation(300, 300);
        setLayout(new FlowLayout());
        setJMenuBar(new MainMenuBar());
        add(new StudentListPanel());

        setVisible(true);
    }
}
