package praktic.geometry.bases;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void printInfo();
}