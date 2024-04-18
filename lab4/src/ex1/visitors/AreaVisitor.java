package ex1.visitors;

import ex1.shape.Circle;
import ex1.shape.Square;

public class AreaVisitor extends ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("The circle's area is: " + (Math.PI * Math.pow(circle.getRadius(), 2)));
    }

    @Override
    public void visit(Square square) {
        System.out.println("The square's area is: " + (square.getSide() * square.getSide()));
    }
}
