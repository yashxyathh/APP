import java.util.Scanner;
public class movie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your seat number : ");
        int seat_no = sc.nextInt();

        if(seat_no % 2 == 1)
            System.out.println("Odd row!!");

        else
            System.out.println("Even row");

        sc.close();
    }    
}
