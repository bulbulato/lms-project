public class Course {
    int id;
    String title;
    String description;

    private static int lastID = 0;

    public Course(String title, String description) {
        this.id = ++lastID;
        this.title = title;
        this.description = description;
    }
}
