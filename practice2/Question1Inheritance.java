import java.util.Scanner;

public class Question1Inheritance {
    static class Employee {
        protected final int employeeId;
        protected final String name;

        Employee(int employeeId, String name) {
            this.employeeId = employeeId;
            this.name = name;
        }
    }

    static class Manager extends Employee {
        protected final double basicSalary;

        Manager(int employeeId, String name, double basicSalary) {
            super(employeeId, name);
            this.basicSalary = basicSalary;
        }
    }

    static class SeniorManager extends Manager {
        private final double bonus;

        SeniorManager(int employeeId, String name, double basicSalary, double bonus) {
            super(employeeId, name, basicSalary);
            this.bonus = bonus;
        }

        void displaySalaryDetails() {
            double totalSalary = basicSalary + bonus;
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + name);
            System.out.printf("Basic Salary: %.2f%n", basicSalary);
            System.out.printf("Bonus: %.2f%n", bonus);
            System.out.printf("Total Salary: %.2f%n", totalSalary);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter bonus: ");
        double bonus = scanner.nextDouble();

        SeniorManager seniorManager =
                new SeniorManager(employeeId, name, basicSalary, bonus);
        seniorManager.displaySalaryDetails();

        scanner.close();
    }
}
