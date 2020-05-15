package src.RemoteControl;

public class Stereo {
    String name;
    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Stereo in on.");
    }

    public void off() {
        System.out.println("Stereo in off.");
    }

    public void setCD() {
        System.out.println("Set CD is ok.");
    }

    public void setVolume(int i) {
        System.out.println("Volume set to " + i);
    }
}
