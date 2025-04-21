package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getArea() {
        return 22 * radius * radius / 7;
    }

    public double getPerimeter() {
        return 2 * 22 * radius / 7;
    }

    @Override
    public void printInfo() {
        System.out.println("======================================");
        System.out.println("Name            : " + name);
        System.out.println("Area            : " + getArea());
        System.out.println("Perimeter       : " + getPerimeter());
        System.out.println("======================================");
    }
}
