package ex3.render;

import ex3.shape.Shape;

public class Outline implements RenderingEngine {
    @Override
    public void style(Shape shape) {
        System.out.println("Drawing outline for " + shape.getName());
        shape.draw();
        System.out.println("Outlining...");
    }
}
