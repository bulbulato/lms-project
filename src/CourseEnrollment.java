import java.util.ArrayList;

public class CourseEnrollment {
    int id;
    Student student;
    Course course;

    ArrayList<CourseEnrollment> list = new ArrayList<>();

    private static int lastID;

    public CourseEnrollment(Student student, Course course) {
        this.id = ++lastID;
        this.student = student;
        this.course = course;
    }
}
