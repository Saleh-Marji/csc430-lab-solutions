package ex4.builders;

import ex4.models.Car;

public abstract class CarBuilder implements VehicleBuilder {
    private Car car;
    public void createNewCar() {
        car = new Car();
    }

    public Car getCar() {
        return car;
    }

    public Car checkNullAndReturn() {
        if(car == null) {
            throw new NullPointerException("Kindly create the car first!");
        }
        return car;
    }
}
