package src.WeatherStation;

//Developers uses Observer and Display for their
//        own visual elements

import src.WeatherStation.interfaces.DisplayElement;
import src.WeatherStation.interfaces.Observer;

public class ThirdPartyDisplay implements DisplayElement, Observer {
    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

    }
}
