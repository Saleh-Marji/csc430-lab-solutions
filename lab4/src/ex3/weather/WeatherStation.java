package ex3.weather;

import ex3.subscriber.WeatherObserver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeatherStation {
    Set<WeatherObserver> observers = new HashSet<>();

    String currentWeather = "Sunny";

    public void addObserver(WeatherObserver weatherObserver) {
        observers.add(weatherObserver);
    }

    public void removeObserver(WeatherObserver weatherObserver) {
        observers.remove(weatherObserver);
    }

    public void notifyObservers() {
        for(WeatherObserver observer : observers) {
            observer.update(currentWeather);
        }
    }

    public void updateWeather(String newWeather) {
        this.currentWeather = newWeather;
        notifyObservers();
    }
}
