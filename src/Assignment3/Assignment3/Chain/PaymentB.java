package Chain;

public class PaymentB extends PaymentHandler {
    private double balance = 300;

    @Override
    public void processPayment(double amount) {
        if (balance >= amount) {
            System.out.println("Payment of " + amount + "$ processed by PaymentB.");
            balance -= amount;
        } else if (nextPaymentMethod != null) {
            System.out.println("Insufficient funds in PaymentB. Redirecting to the next payment method, please wait");
            nextPaymentMethod.processPayment(amount);
        } else {
            System.out.println("Insufficient funds to complete the payment.");
        }
    }
}
