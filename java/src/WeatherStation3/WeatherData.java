package src.WeatherStation3;

import src.WeatherStation3.Interfaces.Observer;
import src.WeatherStation3.Interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    //add container to keep observers and create it in constructor
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {

        }
    }
}