package src.Pizza.PizzaVersions;

import src.Pizza.Ingredients.*;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    ArrayList toppings = new ArrayList();

    public abstract void prepare();
//    {
//
//        System.out.println("Prepare " + name);
//        System.out.println("Tossing dough...");
//        System.out.println("Adding sauce...");
//        System.out.println("Adding toppings...");
//        System.out.println();
//
//        for (int i = 0; i < toppings.size(); i++) {
//            System.out.println(" "+ toppings.get(i));
//        }
//    }
    public void bake() {

        System.out.println("Bake 25 minutes. ");
    }
    public void cut() {
        System.out.println("Cutting into diagonal pieces. ");
    }

//    public void cutQuads() {
//        System.out.println("Cutting into quads pieces. ");
//    }

    public void box() {
        System.out.println("Put in the official box. ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza info";
    }

//    public String getDough() {
//        return dough;
//    }
//
//    public void setDough(String dough) {
//        this.dough = dough;
//    }
//
//    public String getSauce() {
//        return sauce;
//    }
//
//    public void setSauce(String sauce) {
//        this.sauce = sauce;
//    }
//
//    public ArrayList getToppings() {
//        return toppings;
//    }
//
//    public void setToppings(ArrayList toppings) {
//        this.toppings = toppings;
//    }
}
