package src.WeatherStation3;

import src.WeatherStation3.Interfaces.CurrentConditionDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);



    }
}
