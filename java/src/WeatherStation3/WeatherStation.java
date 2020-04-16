package src.WeatherStation3;

import src.WeatherStation3.Interfaces.CurrentConditionDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1,99,666);
        weatherData.setMeasurements(22,99,777);
        weatherData.setMeasurements(33,99,888);
    }
}
