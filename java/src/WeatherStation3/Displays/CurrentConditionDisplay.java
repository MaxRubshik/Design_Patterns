package src.WeatherStation3.Displays;

import src.WeatherStation3.Interfaces.DisplayElement;
import src.WeatherStation3.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            weatherData.getTemperature();
            weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Temp: " + temperature + " Humidity: " + humidity);
    }
}
