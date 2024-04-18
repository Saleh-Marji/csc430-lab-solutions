package ex1.visitors;

import ex1.shape.Circle;
import ex1.shape.Square;

public abstract class ShapeVisitor {
    public abstract void visit(Circle circle);

    public abstract void visit(Square square);
}
