package src.SturBuzz.Drinks;

public class Espresso extends Beverage {
    //Constructor
    public Espresso() {
        description = "Espresso.";
    }

    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
