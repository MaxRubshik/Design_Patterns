package src.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Prepare " + name);
    }

    public void box() {
        System.out.println("In the box" + name);
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
