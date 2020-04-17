package src.WeatherStation3;

import src.WeatherStation3.Interfaces.Observer;
import src.WeatherStation3.Interfaces.Subject;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    //add container to keep observers and create it in constructor
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }


    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
