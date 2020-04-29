package src.Pizza.PizzaVersions;

public class NYStylePizza extends Pizza {
    public NYStylePizza() {
        name = "NYpizza.";
        dough = "NYpizza dough.";
        sauce = "NYpizza sauce.";

        toppings.add("Marinara sauce");
    }

    @Override
    public void cut(){
        System.out.println("Slicing into diagonal pieces.");
    }
}
