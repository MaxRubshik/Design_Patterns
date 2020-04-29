package src.Pizza.Stores;

import src.Pizza.PizzaVersions.ChicagoStylePizza;
import src.Pizza.PizzaVersions.Pizza;
import src.Pizza.PizzaVersions.CheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("Chicago")){
            pizza = new ChicagoStylePizza();
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        return super.orderPizza(type);
    }
}
