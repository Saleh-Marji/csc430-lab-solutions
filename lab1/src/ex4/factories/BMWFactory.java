package ex4.factories;

import ex4.builders.BMWBuilder;
import ex4.builders.CarBuilder;
import ex4.models.Car;

public class BMWFactory implements CarFactory {
    @Override
    public Car buildCar() {
        CarBuilder carBuilder = new BMWBuilder();
        carBuilder.createNewCar();
        carBuilder
                .model()
                .color()
                .year()
                .features();
        return carBuilder.getCar();
    }
}
