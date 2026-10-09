class Student {
    private final int rollNo;
    private final String name;
    private final double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class StudentParameterizedConstructor {
    public static void main(String[] args) {
        Student firstStudent = new Student(101, "Aarav", 86.5);
        Student secondStudent = new Student(102, "yashasvi", 91.0);

        firstStudent.displayStudentDetails();
        secondStudent.displayStudentDetails();
    }
}
