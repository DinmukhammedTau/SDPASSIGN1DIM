public class CoffeeMaker {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeMaker setCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public CoffeeMaker setMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeMaker setSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeRepeat build() {
        return new CoffeeRepeat(coffee, milk, syrup);
    }
}
