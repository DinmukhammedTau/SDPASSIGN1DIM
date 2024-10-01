public class LatteIngredientsFactory implements CoffeeIngredientsFactory {
    public Milk createMilk() {
        return new WholeMilk();
    }

    public Syrup createSyrup() {
        return new ChocolateSyrup();
    }
}
