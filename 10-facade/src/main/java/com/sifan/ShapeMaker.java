package com.sifan;


public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    private Shape triangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
        triangle = new Triangle();
    }

    public String drawTriangle() {
        return triangle.draw();
    }

    public String drawCircle() {
        return circle.draw();
    }

    public String drawRectangle() {
        return rectangle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }
}