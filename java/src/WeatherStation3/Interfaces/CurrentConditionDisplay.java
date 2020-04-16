package src.WeatherStation3.Interfaces;

import src.WeatherStation3.WeatherData;
import src.WeatherStation3.WeatherStation;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current: " + temperature + " F degrees and " + humidity + " %humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
