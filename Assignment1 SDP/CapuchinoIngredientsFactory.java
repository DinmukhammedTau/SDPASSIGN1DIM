public class CapuchinoIngredientsFactory implements CoffeeIngredientsFactory {
    public Milk createMilk() {
        return new WithoutMilk();
    }

    public Syrup createSyrup() {
        return new WithoutSyrup();
    }
}
