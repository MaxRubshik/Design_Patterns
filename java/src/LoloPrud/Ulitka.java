package src.LoloPrud;

import src.LoloPrud.Moving.Moveable;
import src.LoloPrud.Moving.NoMove;
import src.LoloPrud.Voicing.NoVoice;
import src.LoloPrud.Voicing.Voiceable;

public class Ulitka extends Animal implements Voiceable, Moveable {
    @Override
    public void sound() {
        System.out.println("Звук улитки");
    }

    public Ulitka() {
        voiceable = new NoVoice();
        moveable = new NoMove();
    }

    @Override
    public void animalMove() {
        System.out.println("Улитка ползет");
    }
}
