package ex3.shape;

import ex3.render.RenderingEngine;

public abstract class Shape {

    private RenderingEngine style;

    public void styleShape() {
        if(style == null) return;
        style.style(this);
    }

    public RenderingEngine getStyle() {
        return style;
    }

    public void setStyle(RenderingEngine style) {
        this.style = style;
    }

    public abstract void draw();

    public abstract double getArea();

    public abstract String getName();
}
