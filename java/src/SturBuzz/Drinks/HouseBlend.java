package src.SturBuzz.Drinks;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
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
