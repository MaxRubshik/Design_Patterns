package src.Ducks;

import java.util.Observer;

public interface QuackObserver {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
