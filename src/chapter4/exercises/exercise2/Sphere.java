package chapter4.exercises.exercise2;

public class Sphere extends Geometry3D{

    private double radius;

    public Sphere(String name, double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * pi * (radius * radius);
    }
}
