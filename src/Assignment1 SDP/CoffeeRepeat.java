public class CoffeeRepeat implements Cloneable {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeRepeat(Coffee coffee, Milk milk, Syrup syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    @Override
    public CoffeeRepeat clone() {
        try {
            return (CoffeeRepeat) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "CoffeeRepeat{" +
                "coffee=" + coffee.getDescription() +
                ", milk=" + milk.getType() +
                ", syrup=" + syrup.getFlavor() +
                '}';
    }
}
