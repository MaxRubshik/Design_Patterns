package src.Pizza.PizzaVersions;

public class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza() {
        name = "Cheesepizza.";
        dough = "Cheesepizza dough.";
        sauce = "Cheesepizza sauce.";

        toppings.add("Tomato sauce");
    }

    @Override
    public void cut(){
        System.out.println("Slicing into quads.");
    }
}
