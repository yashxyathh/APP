import java.util.Scanner;

public class area{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Lenght of the park : ");
        int lentgh = sc.nextInt();

        System.out.println("Enter the width of the park : ");
        int width = sc.nextInt();

        int park_area = lentgh*width;

        System.out.println("The area of the park is " + park_area);

        sc.close();

    }
}