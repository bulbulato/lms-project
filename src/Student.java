public class Student {
    int id;
    String name;
    String surname;

    private static int lastID = 0;

    public Student(String name, String surname) {
        this.id = ++lastID;
        this.name = name;
        this.surname = surname;
    }
}
