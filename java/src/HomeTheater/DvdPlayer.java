package src.HomeTheater;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD player ON");
    }

    public void play(String movie) {
        System.out.println("Dvd plays: " + movie);
    }

    public void stop() {
        System.out.println("Dvd stopped.");
    }

    public void eject() {
        System.out.println("DVD ejected.");
    }

    public void off() {
        System.out.println("DVD OFF.");
    }
}
