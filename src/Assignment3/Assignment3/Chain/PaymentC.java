package Chain;

public class PaymentC extends PaymentHandler {
    private double balance = 1000;

    @Override
    public void processPayment(double amount) {
        if (balance >= amount) {
            System.out.println("Payment of " + amount + "$ processed by PaymentC.");
            balance -= amount;
        } else {
            System.out.println("Insufficient funds to complete the payment.");
        }
    }
}
