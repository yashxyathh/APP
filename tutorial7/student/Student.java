package student;

public class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
    }
}