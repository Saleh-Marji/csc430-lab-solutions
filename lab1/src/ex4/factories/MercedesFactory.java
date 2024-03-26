package ex4.factories;

import ex4.builders.BMWBuilder;
import ex4.builders.CarBuilder;
import ex4.builders.MercedesBuilder;
import ex4.models.Car;

public class MercedesFactory implements CarFactory {
    @Override
    public Car buildCar() {
        CarBuilder carBuilder = new MercedesBuilder();
        carBuilder.createNewCar();
        carBuilder
                .color()
                .year()
                .model()
                .features();
        return carBuilder.getCar();
    }
}
