package src.Pizza.Stores;

import src.Pizza.Pizza;
import src.Pizza.PizzaStore;
import src.Pizza.PizzaVersions.NYStylePizza;
import src.Pizza.SimplePizzaFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("ny")){
            pizza = new NYStylePizza();
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        return super.orderPizza(type);
    }
}
