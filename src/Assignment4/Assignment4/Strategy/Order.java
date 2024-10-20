package Assignment4.Strategy;

public class Order {
    private double basePrice;
    private PaymentStrategy paymentMethod;

    public Order(double basePrice) {
        this.basePrice = basePrice;
    }

    public void choosePaymentMethod(PaymentStrategy paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void displayFinalCost() {
        double finalCost = paymentMethod.calculateFinalCost(basePrice);
        System.out.println("The final price of the order is: " + finalCost);
    }
}
