package src.SturBuzz.Decorator;

import src.SturBuzz.Drinks.Beverage;
import src.SturBuzz.Size;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        double cost = this.cost() + beverage.cost();
        return Math.round(cost);
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        //return .15 + beverage.cost();
        if(getSize() == Size.TALL){
            cost += .10;
        }else if (getSize() == Size.GRANDE){
            cost += .15;
        }else if (getSize() == Size.VENTI){
            cost += .20;
        }
        return Math.round(cost);
    }



    @Override
    public String getDescription() {

        return beverage.getDescription() + ", Soy";
    }


}
