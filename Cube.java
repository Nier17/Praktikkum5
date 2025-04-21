package praktic.geometry.shapes;

import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.Weightable;

public class Cube extends Shape implements Weightable {
    private double edge;
    private double mass;

    public Cube(double edge, double mass) {
        super("Cube");
        this.edge = edge;
        this.mass = mass;
    }

    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    public double getVolume() {
        return edge * edge * edge;
    }

    public double getWeight() {
        return getVolume() * mass;
    }

    @Override
    public void printInfo() {
        System.out.println("======================================");
        System.out.println("Name            : " + name);
        System.out.println("Surface area    : " + getSurfaceArea());
        System.out.println("Volume          : " + getVolume());
        System.out.println("Weight          : " + getWeight());
        System.out.println("======================================");
    }
}
