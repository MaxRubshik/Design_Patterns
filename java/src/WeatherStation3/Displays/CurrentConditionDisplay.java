package src.WeatherStation3.Displays;

import src.WeatherStation3.Interfaces.DisplayElement;
import src.WeatherStation3.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current: " + temperature +
                " F degrees and " + humidity +
                " %humidity");
    }
    // + " pressure: " + pressure

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            int zzz; //to avoid code marker.
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
