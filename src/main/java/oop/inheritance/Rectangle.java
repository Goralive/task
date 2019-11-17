package oop.inheritance;

public class Rectangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        sideA = a.getDistance(a, b);
        sideB = a.getDistance(a, d);
    }

    private final String name = "Rectangle";

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }


    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
