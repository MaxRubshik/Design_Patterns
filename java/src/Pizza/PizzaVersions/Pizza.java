package src.Pizza.PizzaVersions;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;

    ArrayList toppings = new ArrayList();

    public void prepare() {

        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        System.out.println();

        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" "+ toppings.get(i));
        }
    }

    public void box() {
        System.out.println("In the box " + name);
    }

    public void cut() {
        System.out.println("Cut " + name);
    }

    public void bake() {
        System.out.println("Bake " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }
}
