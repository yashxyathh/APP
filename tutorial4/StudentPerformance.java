import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks;
    double attendance;

    Student(int rollNo, String name, int[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    double getAverage() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total / 3.0;
    }

    void display() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        double average = total / 3.0;
        String result = average >= 50 ? "Pass" : "Fail";
        String scholarship = average >= 75 && attendance >= 80 ? "Eligible" : "Not Eligible";
        String performance = average >= 85 ? "Excellent" : "Good";

        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println();
    }
}
                        
public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[3];

            for (int j = 0; j < 3; j++) {
                System.out.print("Mark " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            System.out.print("Attendance: ");
            double attendance = sc.nextDouble();

            students[i] = new Student(roll, name, marks, attendance);
            System.out.println();
        }

        double highestAverage = students[0].getAverage();
        Student highestStudent = students[0];

        for (int i = 0; i < 5; i++) {
            students[i].display();

            if (students[i].getAverage() > highestAverage) {
                highestAverage = students[i].getAverage();
                highestStudent = students[i];
            }
        }

        System.out.println("Student with Highest Average");
        System.out.println("Roll Number: " + highestStudent.rollNo);
        System.out.println("Name: " + highestStudent.name);
        System.out.println("Average: " + highestAverage);

        sc.close();
    }
}