package ex1;

import ex1.shape.Circle;
import ex1.shape.Square;
import ex1.visitors.AreaVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        AreaVisitor areaVisitor = new AreaVisitor();
        Circle circle = new Circle(2);
        circle.accept(areaVisitor);
        Square square = new Square(2);
        square.accept(areaVisitor);
    }
}