package src.LoloPrud;

import src.LoloPrud.Moving.Move;
import src.LoloPrud.Moving.Moveable;
import src.LoloPrud.Voicing.Voice;
import src.LoloPrud.Voicing.Voiceable;

public class Cat extends Animal implements Moveable, Voiceable {
    @Override
    public void animalMove() {
        System.out.println("Кошарик идет.");
    }

    @Override
    public void sound() {
        System.out.println("Кошарик говорит Мяууу.");
    }

    public Cat() {
        moveable = new Move();
        voiceable = new Voice();
    }
}
