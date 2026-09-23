import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the registration number of first person: ");
        String s1 = sc.nextLine();

        System.out.println("Enter the registration number of second person : ");
        String s2 = sc.nextLine();

        System.out.println();System.out.println();

        System.out.println("Reg. of first person : "+s1 + "for second person is : "+ s2);
        System.out.println();
        System.out.println("After Swaping.....");
        System.out.println();
        
        String temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println();
        System.out.println("Swaped registration for first is "+ s1+" and for second is "+s2);

        sc.close();
    }

}
