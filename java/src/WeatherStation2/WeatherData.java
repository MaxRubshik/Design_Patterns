package src.WeatherStation2;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        setChanged();//changed = true
        notifyObservers();
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    public WeatherData() {
    }
}

