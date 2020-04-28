package src.Pizza;

public class Pizza {
    Pizza orderPizza(String type) {
        Pizza pizza = null;



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
