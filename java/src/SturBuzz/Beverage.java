package src.SturBuzz;

public abstract class Beverage {
    public String description = "Unknown beverage.";
    double milk;
    double soy;
    double mocha;

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}