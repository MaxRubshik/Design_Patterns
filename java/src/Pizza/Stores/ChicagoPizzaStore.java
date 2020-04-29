package src.Pizza.Stores;

import src.Pizza.PizzaVersions.Pizza;
import src.Pizza.PizzaVersions.CheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("Chicago")){
            pizza = new CheesePizza();
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        return super.orderPizza(type);
    }
}
