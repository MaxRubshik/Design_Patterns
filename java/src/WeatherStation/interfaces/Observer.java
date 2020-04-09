package src.WeatherStation.interfaces;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
