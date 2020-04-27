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

    public Beverage() {
        if (getSize() == null)
            setSize("TALL");
    }

    public void setSize(String sizeName) {
        if (sizeName.equalsIgnoreCase("TALL"))
            size = Size.TALL;
        else if (sizeName.equalsIgnoreCase("GRANDE"))
            size = Size.GRANDE;
        else if (sizeName.equalsIgnoreCase("VENTI"))
            size = Size.VENTI;
    }

    public Size getSize() {
        return size;
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