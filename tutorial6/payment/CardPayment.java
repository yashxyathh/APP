package payment;

public class CardPayment implements Payment, OnlineTransaction {

    public void pay(double amount) {
        System.out.println("Card Payment: " + amount);
    }
}