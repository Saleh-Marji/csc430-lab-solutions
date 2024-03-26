package ex4.builders;

public class MercedesBuilder extends CarBuilder {
    @Override
    public VehicleBuilder model() {
        checkNullAndReturn().setModel("Mercedes");
        return this;
    }

    @Override
    public VehicleBuilder year() {
        checkNullAndReturn().setYear(1952);
        return this;
    }

    @Override
    public VehicleBuilder color() {
        checkNullAndReturn().setColor("White");
        return this;
    }

    @Override
    public VehicleBuilder features() {
        checkNullAndReturn().setFeatures("www wwww");
        return this;
    }
}
