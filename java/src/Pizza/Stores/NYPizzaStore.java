package src.Pizza.Stores;

import src.Pizza.PizzaVersions.Pizza;
import src.Pizza.PizzaVersions.NYStylePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("new york")){
            pizza = new NYStylePizza();
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        return super.orderPizza(type);
    }
}
