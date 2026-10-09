import java.util.Scanner;

public class Question2Constructors {
    static class Student {
        private final String name;
        private final int rollNo;
        private final double marks;

        Student() {
            this("Not provided", 0, 0.0);
        }

        Student(String name, int rollNo, double marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.printf("Marks: %.2f%n", marks);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student defaultStudent = new Student();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter marks: ");
        double marks = scanner.nextDouble();

        Student parameterizedStudent = new Student(name, rollNo, marks);

        System.out.println("\nStudent created with the default constructor:");
        defaultStudent.displayDetails();
        System.out.println("\nStudent created with the parameterized constructor:");
        parameterizedStudent.displayDetails();

        scanner.close();
    }
}
