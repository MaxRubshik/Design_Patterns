package src.SturBuzz;

import src.SturBuzz.Decorator.Milk;
import src.SturBuzz.Decorator.Mocha;
import src.SturBuzz.Decorator.Soy;
import src.SturBuzz.Decorator.Whip;
import src.SturBuzz.Drinks.*;

public class StartBuzzCoffeeApp {
    public static void main(String[] args) {
        //Print clear espresso and print cost
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() +
                " $" + beverage.cost());

        //Create DarkRoast obj, wrap it to Mocha, than to second and to Whip
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage4 = new Decaf();
        beverage4 = new Soy(beverage4);
        beverage4 = new Milk(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
        beverage4.setSize("GRANDE");
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

    }
}
