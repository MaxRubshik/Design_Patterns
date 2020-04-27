package src.SturBuzz.Decorator;

import src.SturBuzz.Drinks.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        double cost = this.cost() + beverage.cost();
        return Math.round(cost);
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
