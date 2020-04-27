package src.SturBuzz.Decorator;

import src.SturBuzz.Drinks.Beverage;

import static src.SturBuzz.Drinks.Beverage.TALL;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        //return .15 + beverage.cost();
        double cost = beverage.cost();
        if(getSize() == TALL){
            cost += .10;
        }else if (getSize() == Beverage.GRANDE){
            cost += .15;
        }else if (getSize() == Beverage.VENTI){
            cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ", Soy";
    }


}
