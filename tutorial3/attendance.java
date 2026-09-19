import java.util.Scanner;
public class attendance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] attendance =new int[7];
        int present =0;
        for(int i =0;i<7;i++){
            attendance[i]=sc.nextInt();
            if (attendance[i]==1){
                present+=1;
            }
        }
        System.out.println("Total day present: "+present);
        double percentage= (present*100.0)/7;
        if (percentage>=75.0){
            System.out.println("eligible for exam");
        }
        else{
            System.out.println("not eligible");
        }
        sc.close();
    }
}
