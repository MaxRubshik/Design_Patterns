package src.Pizza;

import src.Pizza.PizzaVersions.ChicagoStylePizza;
import src.Pizza.PizzaVersions.Pizza;
import src.Pizza.Stores.ChicagoPizzaStore;
import src.Pizza.Stores.NYPizzaStore;
import src.Pizza.Stores.PizzaStore;

public class App {
    public static void main(String[] args) {

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza pizzaChi = chicagoPizzaStore.orderPizza("Chicago");
        System.out.println();
        Pizza pizzaNY = nyPizzaStore.orderPizza("New York");

        //SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
    }
}
