package src.HomeTheater;

import javax.crypto.spec.PSource;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on.");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Dvd player set to: " + dvd);
    }

    public void setSurrSound() {
        System.out.println("Surround on");
    }

    public void setVolume(int i) {
        System.out.println("Volume set to: " + i);
    }

    public void off() {
        System.out.println("Amp id OFF.");
    }
}
