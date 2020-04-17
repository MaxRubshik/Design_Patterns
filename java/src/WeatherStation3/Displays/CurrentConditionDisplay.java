package src.WeatherStation3.Displays;

import src.WeatherStation3.Interfaces.DisplayElement;
import src.WeatherStation3.Interfaces.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;

    public CurrentConditionDisplay(Observable observable){

    }

    @Override
    public void display() {
        System.out.println("Current: " + temperature +
                " F degrees and " + humidity +
                " %humidity" + " pressure: " + pressure);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
