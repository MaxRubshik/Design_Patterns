package src.WeatherStation3;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
