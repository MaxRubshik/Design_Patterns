package src.Pizza.Stores;

import src.Pizza.Factory.ChicagoPizzaIngredientFactory;
import src.Pizza.Factory.PizzaIngredientFactory;
import src.Pizza.PizzaVersions.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(item.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style cheese pizza");
        } else if (item.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago style veggie pizza");
        } else if (item.equalsIgnoreCase("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style clam pizza");
        } else if (item.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago style pepperoni pizza");
        }
        return pizza;

    }

//    @Override
//    public Pizza orderPizza(String type) {
//        return super.orderPizza(type);
//    }
}
