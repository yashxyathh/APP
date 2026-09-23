import java.util.Scanner;

public class coding {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the score of First paricipant : ");
        int score1 = sc.nextInt();

        System.out.println("Enter the score of Second paricipant : ");
        int score2 = sc.nextInt();

        System.out.println("Enter the score of third paricipant : ");
        int score3 = sc.nextInt();

        if(score1> score2 && score1>score3)
            System.out.println("First Participant won with the score of : "+ score1);

        else if(score2> score1 && score2>score3)
            System.out.println("Second Participant won with the score of : "+ score2);

        else if(score3> score1 && score3>score2)
            System.out.println("Third participant won with the score of "+score3);
        else if (score1==score2 && score2==score3)
            System.out.println("Contest ended in Draw!!");
        else if (score1==score2 && score1>score3)
            System.out.println("First and second participant had a draw!!");
        else if (score3==score2 && score1<score3)
            System.out.println("second and third participant had a draw!!");
        else 
            System.out.println("first and third participant had a draw!!");
        sc.close();
    }    
}
