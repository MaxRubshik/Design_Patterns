package src.Pizza.Stores;

import src.Pizza.Pizza;
import src.Pizza.PizzaStore;
import src.Pizza.SimplePizzaFactory;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese")){
            //pizza = new NYPizzaStore()
        }
        return null;
    }
}
