package src.SturBuzz;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee.";
    }

    @Override
    public double cost() {
        return .89;
    }

    @Override
    public String getDescription() {
        System.out.println("House Blend");
        return null;
    }
}
