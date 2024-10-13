package Chain;

public class PaymentA extends PaymentHandler {
    private double balance = 100;

    @Override
    public void processPayment(double amount) {
        if (balance >= amount) {
            System.out.println("Payment of " + amount + "$ processed by PaymentA.");
            balance -= amount;
        } else if (nextPaymentMethod != null) {
            System.out.println("Insufficient funds in PaymentA. Redirecting to the next payment method, please wait");
            nextPaymentMethod.processPayment(amount);
        } else {
            System.out.println("Insufficient funds to complete the payment.");
        }
    }
}
