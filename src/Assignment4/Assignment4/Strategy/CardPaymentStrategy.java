package Assignment4.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalCost(double basePrice) {
        return basePrice + (basePrice * 0.02);
    }
}

