package src.Pizza;

import static src.Pizza.SimplePizzaFactory.createPizza;

public abstract class Pizza {
    Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
//        String name;
//        String dough;
//        String sauce;

        //ArrayList toppings = new ArrayList();


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public void prepare() {
        System.out.println("Prepare.");
    }

    public void box() {
        System.out.println("In the box");
    }

    public void cut() {
        System.out.println("Cut");
    }

    public void bake() {
        System.out.println("Bake");
    }
}
