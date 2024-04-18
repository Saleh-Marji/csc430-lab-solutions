package ex3.display;

import ex3.subscriber.WeatherObserver;

public class StaticsDisplay implements WeatherObserver {
    @Override
    public void update(String weatherData) {
        System.out.println("Statically speaking... The weather is "+weatherData);
    }
}
