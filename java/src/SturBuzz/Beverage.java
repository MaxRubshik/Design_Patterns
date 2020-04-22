package src.SturBuzz;

public abstract class Beverage {
    public String description;
    double milk;
    double soy;
    double mocha;

    public abstract double cost();

    public abstract void getDescription();

    public abstract boolean hasMilk();

    public abstract boolean hasSoy();

    public abstract boolean hasMocha();

    public abstract boolean setMilk();

    public abstract boolean setSoy();

    public abstract boolean setMocha();

}