package ex1.shape;

import ex1.visitors.ShapeVisitor;

public abstract class Shape {
    abstract void accept(ShapeVisitor visitor);
}
