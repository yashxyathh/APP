import student.Student;
import course.Course;

public class College {
    public static void main(String[] args) {
        Student s = new Student("Yashasvi", 101);
        Course c = new Course("Computer Science", 4);

        s.display();
        c.display();
    }
}