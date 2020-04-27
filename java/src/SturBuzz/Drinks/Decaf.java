package src.SturBuzz.Drinks;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }

    @Override
    public String getDescription() {
        return getSize().getName() + " " + description;
    }

    @Override
    public double getCost() {
        double cost = this.cost() + getSize().getCost();
        return Math.round(cost);
    }
}
