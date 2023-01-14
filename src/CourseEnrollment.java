import java.util.ArrayList;

public class CourseEnrollment {
    private int id;
    private Student student;
    private Course course;

    static ArrayList<CourseEnrollment> list = new ArrayList<>();

    private static int lastID;

    public CourseEnrollment(Student student, Course course) {
        this.id = ++lastID;
        this.student = student;
        this.course = course;
        list.add(this);
    }

    static void getCoursesByStudent(Student student) {
        for (CourseEnrollment courseEnrollment : list) {
            if (student.getId() == courseEnrollment.student.getId()) {
                System.out.println("ID зачисления: " + courseEnrollment.id);
                System.out.print(courseEnrollment.student + " - ");
                System.out.println(courseEnrollment.course);
                System.out.println();
            }
        }
    }

    static void getStudentsByCourse(Course course) {
        for (CourseEnrollment courseEnrollment : list) {
            if (courseEnrollment.course.getId() == course.getId()) {
                System.out.println("ID зачисления: " + courseEnrollment.id);
                System.out.print(courseEnrollment.course + " - ");
                System.out.println(courseEnrollment.student);
                System.out.println();
            }
        }
    }
}
