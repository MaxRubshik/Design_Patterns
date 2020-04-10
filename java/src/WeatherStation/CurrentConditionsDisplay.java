package src.WeatherStation;

import src.WeatherStation.interfaces.DisplayElement;
import src.WeatherStation.interfaces.Observer;
import src.WeatherStation.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public void update() {

    }

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current: " +temperature+ " F degrees and " +humidity+ " %humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
