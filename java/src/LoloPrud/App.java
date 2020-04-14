package src.LoloPrud;

import src.LoloPrud.Moving.NoMove;

public class App {
    public static void main(String[] args) {
        Cat koshachieDela = new Cat();
        koshachieDela.tryToMove();
        koshachieDela.setMoveable(new NoMove());
        koshachieDela.tryToMove();
        koshachieDela.sound();

        System.out.println();

        Ulitka patrick = new Ulitka();
        patrick.sound();
        patrick.animalMove();

    }
}
