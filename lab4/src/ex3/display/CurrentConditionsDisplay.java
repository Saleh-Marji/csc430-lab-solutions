package ex3.display;

import ex3.subscriber.WeatherObserver;

public class CurrentConditionsDisplay implements WeatherObserver {

    @Override
    public void update(String weatherData) {
        System.out.println("Current weather conditions are: "+weatherData);
    }
}
