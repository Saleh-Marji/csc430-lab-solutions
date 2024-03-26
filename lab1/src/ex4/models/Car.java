package ex4.models;

public class Car implements Vehicle {
    private String model;
    private int year;
    private String color;
    private String features;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getFeatures() {
        return features;
    }

    @Override
    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", features='" + features + '\'' +
                '}';
    }
}
