package src.Pizza.Stores;

import src.Pizza.PizzaVersions.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("Chicago")){
            pizza = new ChicagoCheesePizza();
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        return super.orderPizza(type);
    }
}
