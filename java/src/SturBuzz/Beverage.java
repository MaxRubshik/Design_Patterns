package src.SturBuzz;

public abstract class Beverage {
    public String description;
    double milk;
    double soy;
    double mocha;

    public abstract double cost();

    public abstract void getDescription();
}