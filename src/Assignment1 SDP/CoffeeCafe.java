public class CoffeeCafe {
    private static CoffeeCafe instance;

    private CoffeeCafe() {}

    public static CoffeeCafe getInstance() {
        if (instance == null) {
            instance = new CoffeeCafe();
        }
        return instance;
    }

    // Updated placeOrder method to accept CoffeeRepeat object
    public void placeOrder(CoffeeRepeat order) {
        System.out.println("Order placed for: " + order);
    }

    // Optionally, you can still keep this method to accept Coffee
    public void placeOrder(Coffee coffee) {
        System.out.println("Order placed for: " + coffee.getDescription());
    }
}
