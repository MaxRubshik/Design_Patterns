package src.Pizza.Stores;

import src.Pizza.Factory.CaliPizzaIngredientFactory;
import src.Pizza.Factory.PizzaIngredientFactory;
import src.Pizza.PizzaVersions.*;

public class CaliPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliPizzaIngredientFactory();

        if(item.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California style cheese pizza");
        } else if (item.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California style veggie pizza");
        } else if (item.equalsIgnoreCase("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California style clam pizza");
        } else if (item.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California style pepperoni pizza");
        }
        return pizza;

    }
}
