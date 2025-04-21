package praktic.geometry.mains;

import praktic.geometry.shapes.*;
import praktic.geometry.interfaces.*;
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String RED = "\u001B[31m";  
        final String RESET = "\u001B[0m";  

        System.out.println("======================================");
        System.out.println("Shape Calculator");
        System.out.println("REINHARD FRANO RANDALINGGI") ; 
        System.out.println("245150707111043");           
        System.out.println("======================================");

        System.out.println("2D Circle");
        System.out.println("======================================");
        System.out.print("Enter radius    : ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        circle.printInfo();

        System.out.println("2D Square");
        System.out.println("======================================");
        System.out.print("Enter side      : ");
        double side = input.nextDouble();
        Square square = new Square(side);
        square.printInfo();

        System.out.println("3D Weightable Cube");
        System.out.println("======================================");
        System.out.print("Enter edge      : ");
        double edge = input.nextDouble();
        System.out.print("Enter mass      : ");
        double massCube = input.nextDouble();
        Cube cube = new Cube(edge, massCube);
        cube.printInfo();

        System.out.println("3D Weightable Sphere");
        System.out.println("======================================");
        System.out.print("Enter radius    : ");
        double radius3d = input.nextDouble();
        System.out.print("Enter mass      : ");
        double massSphere = input.nextDouble();
        Sphere sphere = new Sphere(radius3d, massSphere);
        sphere.printInfo();

        System.out.println(RED + "Volume of Cube and Sphere" + RESET);
        System.out.println(RED + "POLYMORPHISM: INTERFACE" + RESET);
        System.out.println(RED + "======================================" + RESET);

        System.out.print(RED + "Enter edge      : " + RESET);
        double e = input.nextDouble();
        System.out.print(RED + "Enter radius    : " + RESET);
        double r = input.nextDouble();
        System.out.print(RED + "Enter mass      : " + RESET);
        double m = input.nextDouble();

        Weightable c = new Cube(e, m);
        Weightable s = new Sphere(r, m);

        System.out.println(RED + "Cube’s volume   : " + ((Cube) c).getVolume() + RESET);
        System.out.println(RED + "Sphere’s volume : " + ((Sphere) s).getVolume() + RESET);
        System.out.println(RED + "Weight          : " + s.getWeight() + RESET);
        System.out.println(RED + "======================================" + RESET);

        input.close();
    }
}
