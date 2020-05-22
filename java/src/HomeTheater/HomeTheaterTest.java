package src.HomeTheater;

public class HomeTheaterTest {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd, projector,
                        screen, lights, popper);

        homeTheater.watchMovie("Adrenalin");
        homeTheater.endMovie();
    }
}
