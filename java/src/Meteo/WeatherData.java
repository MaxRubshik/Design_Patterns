package src.Meteo;

public abstract class WeatherData {

    abstract void getTemperature();

    abstract void getHumdity();

    abstract void getPressure();

    public void measurementsChanged(){
        System.out.println();
    }
}
