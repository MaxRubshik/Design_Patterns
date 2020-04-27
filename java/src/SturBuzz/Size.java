package src.SturBuzz;

public enum Size {
    TALL("Tall", .10),
    GRANDE("Grande", .15),
    VENTI("Venti", .20);

    private String name;
    private double cost;

    Size(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
