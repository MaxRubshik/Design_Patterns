package src.Midi;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;

public class BeatModel implements BeatModeInterface, MetaEventListener {
    @Override
    public void meta(MetaMessage meta) {

    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }
}
