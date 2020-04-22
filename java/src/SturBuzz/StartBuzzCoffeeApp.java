package src.SturBuzz;

import src.SturBuzz.Decorator.Mocha;
import src.SturBuzz.Decorator.Whip;

public class StartBuzzCoffeeApp {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() +
                " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
    }
}
