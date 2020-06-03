package src.MenuItem;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menuuu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu =
                new Menuuu("DINER MENU", "Launch");
        MenuComponent cafeMenu =
                new Menuuu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menuuu("DESSERT MENU", "Dessert of course!");


        MenuComponent allMenus =
                new Menuuu("ALL MENUS", "All Menus Comdined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara",
                true,
                3.89
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                        "Apple Pie",
                        "Apple with flakey crust",
                        true,
                        1.59
                )
        );

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
