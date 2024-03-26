package ex4.builders;

public interface VehicleBuilder {
    VehicleBuilder model();
    VehicleBuilder year();
    VehicleBuilder color();
    VehicleBuilder features();
}
