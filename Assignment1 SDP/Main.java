public class Main {
    public static void main(String[] args) {
        // Singleton pattern
        CoffeeCafe coffeeCafe = CoffeeCafe.getInstance();

        // Factory method pattern
        CoffeeFactory capuchinoFactory = new CapuchinoFactory();
        Coffee capuchino = capuchinoFactory.createCoffee();

        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();

        // Abstract factory pattern
        CoffeeIngredientsFactory capuchinoIngredientsFactory = new CapuchinoIngredientsFactory();
        Milk capuchinoMilk = capuchinoIngredientsFactory.createMilk();
        Syrup capuchinoSyrup = capuchinoIngredientsFactory.createSyrup();

        CoffeeIngredientsFactory latteIngredientsFactory = new LatteIngredientsFactory();
        Milk latteMilk = latteIngredientsFactory.createMilk();
        Syrup latteSyrup = latteIngredientsFactory.createSyrup();

        //build Pattern
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        CoffeeRepeat customOrder = coffeeMaker.setCoffee(capuchino)
                .setMilk(capuchinoMilk)
                .setSyrup(capuchinoSyrup)
                .build();

        coffeeCafe.placeOrder(customOrder);

        // Creating Prototype pattern
        CoffeeRepeat clonedOrder = customOrder.clone();
        coffeeCafe.placeOrder(clonedOrder);
    }
}
