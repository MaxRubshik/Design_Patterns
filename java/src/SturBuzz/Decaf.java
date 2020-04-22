package src.SturBuzz;

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
        return description;
    }
}
