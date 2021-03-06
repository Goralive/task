package oop.inheritance;

public class Circle extends Shape {
    private String name = "Circle";
    private Point a;
    private Point b;
    private double radius;


    public Circle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.radius = a.getDistance(a, b);
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.pow(Math.PI, 2) * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getName() {
        return name;
    }
}
