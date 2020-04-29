package src.Pizza.Stores;

import src.Pizza.Pizza;
import src.Pizza.PizzaStore;
import src.Pizza.PizzaVersions.CheesePizza;
import src.Pizza.SimplePizzaFactory;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        return super.orderPizza(type);
    }
}
