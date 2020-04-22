package src.SturBuzz;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String getDescription() {
        System.out.println("it's Decaf");
        return null;
    }
}
