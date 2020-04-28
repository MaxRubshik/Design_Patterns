package src.Pizza.Stores;

import src.Pizza.Pizza;
import src.Pizza.PizzaStore;
import src.Pizza.SimplePizzaFactory;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }


    public Pizza createPizza(String type) {
        return null;
    }
}
