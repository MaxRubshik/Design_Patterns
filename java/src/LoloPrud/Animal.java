package src.LoloPrud;

import src.LoloPrud.Moving.Moveable;
import src.LoloPrud.Voicing.Voiceable;

public abstract class Animal {

    Voiceable voiceable;
    Moveable moveable;

    void tryToMove(){
        moveable.animalMove();
    }

    public void setVoiceable(Voiceable v) {
        this.voiceable = v;
    }

    public void setMoveable(Moveable m){
        this.moveable = m;
    }
}
