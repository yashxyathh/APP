import java.util.Scanner;

public class student_marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks : ");
        int marks = sc.nextInt();

        if(marks>=50)
            System.out.println("You PASSED!!");

        else
            System.out.println("You FAILED");

        sc.close();
    }    
}
