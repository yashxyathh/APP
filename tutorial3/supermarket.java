import java.util.Scanner;
public class supermarket {
    public static void main(String[] args) {
        double total=0;
        double[] price=new double[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            price[i]=sc.nextInt();
            total+=price[i];
        }
        System.out.println("Total bill: "+total);
        if (total>5000){
            System.out.println("Discount applicable");
        }
        else{
            System.out.println("No discount");
        }
        sc.close();
    }
}
