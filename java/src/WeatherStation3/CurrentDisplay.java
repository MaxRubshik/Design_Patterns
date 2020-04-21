package src.WeatherStation3;

import src.WeatherStation3.Interfaces.DisplayElement;
import src.WeatherStation3.Interfaces.Subject;

import java.util.Observable;
import java.util.Observer;

//realize Observer to register as observer. DisElem - like all displays
public class CurrentDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    //Constructor to register as observer
    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temp is: " + temperature +
                " humidity: " + humidity + " pressure: " + pressure);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
         this.humidity = humidity;
         display();
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
