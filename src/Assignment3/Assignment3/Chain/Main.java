package Chain;

public class Main {
    public static void main(String[] args) {
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        paymentA.setNextPaymentMethod(paymentB);
        paymentB.setNextPaymentMethod(paymentC);

        double totalAmount = 210;
        System.out.println("Attempting to make a purchase with total amount: " + totalAmount +"$");
        paymentA.processPayment(totalAmount);
    }
}
