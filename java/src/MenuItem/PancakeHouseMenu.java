package src.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B Pancake breakfast",
                "Pancakes with scrambled eggs and toast",
                true, 2.99);

        addItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage",
                false, 2.99);

        addItem("BlueBerry Pancakes", "Pancakes made with fresh blueberries",
                true, 3.49);

        addItem("Waffles", "Waffles with your choice of blueberries or strawberries",
                true, 3.593);
    }

    private void addItem(String name, String description,
                         boolean vegetarian, double price) {

        MenuItem menuItem = new MenuItem(name, description,
                vegetarian, price);

        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
