package src.LoloPrud.Moving;

public class NoMove implements Moveable {
    @Override
    public void animalMove() {
        System.out.println("Я не двигаюсь.");
    }
}
