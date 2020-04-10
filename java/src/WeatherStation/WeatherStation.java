package src.WeatherStation;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80.0f,65,30.4f);
        weatherData.setMeasurements(82.0f,70,29.4f);
        weatherData.setMeasurements(78.0f,90,29.2f);
    }
}
