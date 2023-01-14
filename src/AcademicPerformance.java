import java.util.ArrayList;

public class AcademicPerformance {

    private int id;
    private int mark;
    private CourseEnrollment courseEnrollment;

    private static ArrayList<AcademicPerformance> list = new ArrayList<>();
    static int lastID = 0;


    AcademicPerformance(CourseEnrollment courseEnrollment, int mark) {
        this.id = ++lastID;
        this.courseEnrollment = courseEnrollment;
        setMark(mark);
        list.add(this);
    }

    void setMark(int mark) {
        if (mark < 1) mark = 1;
        if (mark > 100) mark = 100;
        this.mark = mark;
    }
}
