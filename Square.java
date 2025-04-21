package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
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