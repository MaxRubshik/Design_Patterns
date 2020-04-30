package src.Pizza.Stores;

import src.Pizza.Factory.NYPizzaIngredientFactory;
import src.Pizza.Factory.PizzaIngredientFactory;
import src.Pizza.PizzaVersions.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY style cheese pizza.");
        } else if (item.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY style veggie pizza");
        } else if (item.equalsIgnoreCase("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY style clam pizza");
        } else if (item.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY style pepperoni pizza");
        }
        return pizza;
    }


//    @Override
//    public Pizza createPizza(String type) {
//        Pizza pizza = null;
//        if(type.equalsIgnoreCase("new york")){
//            pizza = new NYCheesePizza();
//        }
//        return pizza;
//    }
//
//    @Override
//    public Pizza orderPizza(String type) {
//        return super.orderPizza(type);
//    }
}
