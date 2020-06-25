package src.Midi;

public interface BeatModeInterface {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BeatObserver o);
    void registerObserver(BeatObserver o);
    void removeObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
