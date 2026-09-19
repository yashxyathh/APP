import student.Student;
import course.Course;

public class clg {
    public static void main(String[] args) {

        Student s = new Student(101, "Yashasvi");
        Course c = new Course(201, "Computer Science");

        s.display();
        c.display();
    }
}