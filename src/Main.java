public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Василий", "Федоров");
        Student student2 = new Student("Иван", "Иванов");
        Student student3 = new Student("Петр", "Петров");


        Course course1 = new Course("Scratch", "Для самых маленьких");
        Course course2 = new Course("Python", "Для начинающих");
        Course course3 = new Course("Java Pro", "Для продвинутых");


        CourseEnrollment courseEnrollment1 = new CourseEnrollment(student1, course2);
        CourseEnrollment courseEnrollment2 = new CourseEnrollment(student2, course2);
        CourseEnrollment courseEnrollment3 = new CourseEnrollment(student3, course3);

        student1.getCourses();
        student2.getCourses();
        course2.getStudents();
    }
}