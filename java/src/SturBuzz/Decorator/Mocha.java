package src.SturBuzz.Decorator;

import src.SturBuzz.Drinks.Beverage;
import src.SturBuzz.Size;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {

        this.beverage = beverage;
    }

    @Override
    public double cost() {

        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ", Mocha";
    }
}
