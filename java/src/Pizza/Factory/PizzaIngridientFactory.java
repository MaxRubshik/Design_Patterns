package src.Pizza.Factory;

public interface PizzaIngridientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies createVeggies();
    public Pepperoni createPeppertoni();
    public Clams createClams();
}
