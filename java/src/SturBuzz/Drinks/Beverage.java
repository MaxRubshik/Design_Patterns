package src.SturBuzz.Drinks;

import src.SturBuzz.Size;

public abstract class Beverage {

    public String description = "Unknown beverage.";
    double milkCost;
    double soyCost;
    double mochaCost;
    double whipCost;
    double condimentCost = 0.0;

    private Size size;

    public void setSize(Beverage b) {
        size = b;
    }

    public Beverage getSize(Beverage b) {
        return b.size;
    }


    public double cost() {
        if (hasMilk()) {
            condimentCost += milkCost;
        }
        if (hasSoy()) {
            condimentCost += soyCost;
        }
        if (hasMocha()) {
            condimentCost += mochaCost;
        }
        if (hasWhip()) {
            condimentCost += whipCost;
        }
        return condimentCost;
    }

    private boolean hasWhip() {
        return false;
    }

    private boolean hasMocha() {
        return false;
    }

    private boolean hasSoy() {
        return false;
    }

    private boolean hasMilk() {
        return false;
    }

    public String getDescription() {
        return description;
    }


}