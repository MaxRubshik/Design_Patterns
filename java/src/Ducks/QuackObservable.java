package src.Ducks;

import src.WeatherStation.interfaces.Observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
