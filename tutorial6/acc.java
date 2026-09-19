import banking.*;
import payment.*;

public class acc {
    public static void main(String[] args) {

        Account a;

        a = new SavingsAccount();
        a.displayDetails();

        a = new CurrentAccount();
        a.displayDetails();

        Payment p1 = new UPIPayment();
        p1.pay(500);

        UPIPayment upi = new UPIPayment();
        upi.verifyPayment();

        Payment p2 = new CardPayment();
        p2.pay(1000);

        if (p1 instanceof OnlineTransaction)
            System.out.println("UPI is an Online Transaction");

        if (p2 instanceof OnlineTransaction)
            System.out.println("Card is an Online Transaction");
    }
}