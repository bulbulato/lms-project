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
        add(new AddStudentPanel());
        setJMenuBar(new MainMenuBar());

        setVisible(true);
    }
}
