package chapter4.exercises.exercise2;

public class Rectangle extends Geometry2D{
    protected String name;
    protected double width;
    private double height;

    public Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name, double width){
        super(name);
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (height + width);
    }
}
