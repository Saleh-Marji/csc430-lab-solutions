package ex3.render;

import ex3.shape.Shape;

public class SolidFill implements RenderingEngine {
    @Override
    public void style(Shape shape) {
        shape.draw();
        System.out.printf("Filling the %s...%n", shape.getName().toLowerCase());
    }
}
