public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Василий", "Федоров");
        Student student2 = new Student("Иван", "Иванов");
        Student student3 = new Student("Петр", "Петров");


        Course course1 = new Course("Scratch", "Для самых маленьких");
        Course course2 = new Course("Python", "Для начинающих");
        Course course3 = new Course("Java Pro", "Для продвинутых");


        CourseEnrollment ce1 = new CourseEnrollment(student1, course2);
        CourseEnrollment ce2 = new CourseEnrollment(student1, course1);
        CourseEnrollment ce3 = new CourseEnrollment(student3, course3);

//        System.out.println(student1.getCourses());
//        System.out.println(student2.getCourses());
//        System.out.println(course2.getStudents());

        AcademicPerformance ap1 = new AcademicPerformance(ce1, 90);
        AcademicPerformance ap2 = new AcademicPerformance(ce1, 88);
        AcademicPerformance ap3 = new AcademicPerformance(ce2, 20);
        AcademicPerformance ap4 = new AcademicPerformance(ce2, 99);

//        AcademicPerformance.getMarksByStudentAndCourse(student1, course2);
//        AcademicPerformance.getMarksByStudentAndCourse(student2, course2);

    }
}