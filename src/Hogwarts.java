import java.util.ArrayList;

public class Hogwarts {
    private static final ArrayList<Teacher> Teachers = new ArrayList<>();
    private static final ArrayList<Student> Students = new ArrayList<>();

    public static ArrayList<Student> getStudents() {
        return Students;
    }

    public static ArrayList<Teacher> getTeachers() {
        return Teachers;
    }

    public static void addStudent(Student student)
    {
        Students.add(student);
    }

    protected static void addTeachers(Teacher teacher)
    {
        Teachers.add(teacher);
    }
}
