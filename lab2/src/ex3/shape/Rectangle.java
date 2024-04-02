package ex3.shape;

public class Rectangle extends Shape{
    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public void draw() {
        System.out.println("Drawing rectangle...");
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
