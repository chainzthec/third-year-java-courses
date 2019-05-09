package chapter4.exercises.exercise2;

public class Cylinder extends Geometry3D{

    private double radius;
    private double height;

    public Cylinder(String name, double radius, double height){
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return pi *  2 * radius * height;
    }

    public double getVolume(){
        return pi * (radius * radius) * height;
    }
}
