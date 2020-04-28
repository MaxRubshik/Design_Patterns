package src.Pizza;

import src.Pizza.PizzaVersions.CheesePizza;
import src.Pizza.PizzaVersions.ClamPizza;
import src.Pizza.PizzaVersions.PepperoniPizza;
import src.Pizza.PizzaVersions.VeggiePizza;

//Универсальный метод производства пиццы

public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
