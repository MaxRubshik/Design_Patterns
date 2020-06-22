package src.Ducks;

import java.util.Observer;

public class RedHeadDuck implements Quackable {
    QuackObservable quackObservable;

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void registerObserver(Observer observer) {
        quackObservable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackObservable.notifyObservers();
    }
}
