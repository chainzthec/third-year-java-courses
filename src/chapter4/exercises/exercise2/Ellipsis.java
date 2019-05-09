package chapter4.exercises.exercise2;

public class Ellipsis extends Geometry2D {

    protected String name;
    protected double a;
    private double b;

    public Ellipsis(String name, double a, double b){
        super(name);
        if(a > b){
            this.b = a;
            this.a = b;
        }else {
            this.a = a;
            this.b = b;
        }
    }

    public Ellipsis(String name, double a){
        super(name);
        this.a = a;
    }

    @Override
    public double getArea() {
        return pi * a * b;
    }
}
