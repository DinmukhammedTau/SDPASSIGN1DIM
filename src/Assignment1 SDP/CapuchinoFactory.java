public class CapuchinoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Capuchino();
    }
}
