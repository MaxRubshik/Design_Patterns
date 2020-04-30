package src.Pizza.PizzaVersions;

import src.Pizza.Factory.PizzaIngridientFactory;

public class CheesePizza extends Pizza {
    PizzaIngridientFactory ingredientFactory;

    public CheesePizza(PizzaIngridientFactory ingridientFactory) {
        this.ingredientFactory = ingridientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

