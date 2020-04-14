package src.LoloPrud.Voicing;

public class NoVoice implements Voiceable {
    @Override
    public void sound() {
        System.out.println("Я молчу");
    }
}
