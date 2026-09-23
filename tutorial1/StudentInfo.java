import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String Name = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        String Reg = sc.nextLine();

        System.out.print("Enter Department: ");
        String Dept = sc.nextLine();

        System.out.print("Enter Year of Study: ");
        int Year = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter College Name: ");
        String ClgName = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name = " + Name);
        System.out.println("Reg. Number = " + Reg);
        System.out.println("Department = " + Dept);
        System.out.println("Year of Study = " + Year);
        System.out.println("College = " + ClgName);

        sc.close();
    }
}