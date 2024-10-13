package Chain;

public abstract class PaymentHandler {
    protected PaymentHandler nextPaymentMethod;

    public void setNextPaymentMethod(PaymentHandler nextPaymentMethod) {
        this.nextPaymentMethod = nextPaymentMethod;
    }

    public abstract void processPayment(double amount);
}
