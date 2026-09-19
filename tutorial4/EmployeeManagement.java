import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    double monthlySalary;

    Employee(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    double annualSalary() {
        return monthlySalary * 12;
    }

    double bonus() {
        return monthlySalary >= 30000 ? annualSalary() * 0.10 : 0;
    }

    String eligibility() {
        return monthlySalary >= 30000 ? "Eligible" : "Not Eligible";
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: ₹" + monthlySalary);
        System.out.println("Annual Salary: ₹" + annualSalary());
        System.out.println("Bonus: ₹" + bonus());
        System.out.println("Bonus Eligibility: " + eligibility());
        System.out.println();
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Monthly Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            employees[i].display();
        }

        sc.close();
    }
}