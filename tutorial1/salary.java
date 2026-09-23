import java.util.Scanner;

public class salary{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base salary.");
        int base_salary = sc.nextInt();

        System.out.println("Enter allowance.");
        int allowance = sc.nextInt();

        System.out.println("Total In hand is : " + (base_salary + allowance));

        sc.close();
    }

}