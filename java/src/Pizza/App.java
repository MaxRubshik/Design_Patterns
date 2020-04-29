package src.Pizza;

import src.Pizza.PizzaVersions.Pizza;
import src.Pizza.Stores.ChicagoPizzaStore;
import src.Pizza.Stores.NYPizzaStore;

public class App {
    public static void main(String[] args) {
//        PizzaStore newYorkStore = new NYPizzaStore();
//        newYorkStore.orderPizza("Veggie");
//
//        PizzaStore chicagoStore = new ChicagoPizzaStore();
//        chicagoStore.orderPizza("veggie");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizzaChi = chicagoPizzaStore.orderPizza("Chicago");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizzaNY = nyPizzaStore.orderPizza("New York");

        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
    }
}
