package ex4.builders;

public class BMWBuilder extends CarBuilder {
    @Override
    public VehicleBuilder model() {
        checkNullAndReturn().setModel("BMW");
        return this;
    }

    @Override
    public VehicleBuilder year() {
        checkNullAndReturn().setYear(2012);
        return this;
    }

    @Override
    public VehicleBuilder color() {
        checkNullAndReturn().setColor("Black");
        return this;
    }

    @Override
    public VehicleBuilder features() {
        checkNullAndReturn().setFeatures("Vroom vrom");
        return this;
    }
}
