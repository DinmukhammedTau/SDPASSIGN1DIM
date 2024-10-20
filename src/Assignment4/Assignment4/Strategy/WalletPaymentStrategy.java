package Assignment4.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalCost(double basePrice) {
        return basePrice;
    }
}

