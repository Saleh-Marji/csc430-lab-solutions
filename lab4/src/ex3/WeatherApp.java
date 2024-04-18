package ex3;

import ex3.display.CurrentConditionsDisplay;
import ex3.display.StaticsDisplay;
import ex3.weather.WeatherStation;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new CurrentConditionsDisplay());
        weatherStation.addObserver(new StaticsDisplay());

        weatherStation.notifyObservers();

        weatherStation.updateWeather("Rainy");
    }
}
