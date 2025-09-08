public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public int cost() {
        return beverage.cost() + 5; // add milk cost
    }
}

