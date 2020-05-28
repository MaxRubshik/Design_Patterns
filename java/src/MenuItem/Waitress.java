package src.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        PancakeHouseMenu breakfastMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
        //ArrayList breakfastMenu = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        //MenuItem[] lunchItems = dinerMenu.getMenuItems();

        //Print two ways for 2 different types of cafe.
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription()+ " ");
        }

//        for (int i = 0; i < lunchItems.length ; i++) {
//            MenuItem menuItem = lunchItems[i];
//            System.out.print(menuItem.getName()+ " ");
//            System.out.println(menuItem.getPrice() + " ");
//            System.out.println(menuItem.getDescription() + " ");
//        }

//        Iterator iterator = breakfastMenu.createIterator();
//        while (iterator.hasNext()){
//            MenuItem menuItem = (MenuItem) iterator.next();
//        }
    }
}
