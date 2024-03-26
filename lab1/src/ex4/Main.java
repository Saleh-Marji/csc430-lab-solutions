package ex4;

import ex4.factories.BMWFactory;
import ex4.factories.MercedesFactory;
import ex4.models.Car;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new MercedesFactory().buildCar();
        System.out.println(mercedes);
        Car bmw = new BMWFactory().buildCar();
        System.out.println(bmw);
    }
}
