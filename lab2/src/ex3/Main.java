package ex3;

import ex3.render.SolidFill;
import ex3.shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(2);
        rectangle.setWidth(5);
        rectangle.setStyle(new SolidFill());
        System.out.println(rectangle.getArea());

        rectangle.styleShape();
    }
}
