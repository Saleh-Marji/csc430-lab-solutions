package ex3.shape;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends Shape {

    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        for(Shape shape : shapes) {
            shape.draw();
        }
    }

    @Override
    public double getArea() {
        double result = 0;
        for(Shape shape : shapes) {
            result += shape.getArea();
        }
        return result;
    }

    @Override
    public String getName() {
        return "Composite Shape";
    }
}
