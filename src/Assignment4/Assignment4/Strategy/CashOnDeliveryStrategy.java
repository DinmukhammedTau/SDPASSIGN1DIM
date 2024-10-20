package Assignment4.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalCost(double basePrice) {
        return basePrice + 300;
    }
}
