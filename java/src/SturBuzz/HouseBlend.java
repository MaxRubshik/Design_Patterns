package src.SturBuzz;

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
        return description;
    }
}
