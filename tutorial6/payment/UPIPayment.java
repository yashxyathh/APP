package payment;

public class UPIPayment implements SecurePayment, OnlineTransaction {

    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }

    public void verifyPayment() {
        System.out.println("UPI Payment Verified");
    }
}