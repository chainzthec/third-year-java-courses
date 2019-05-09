package chapter4.exercises.exercise2;

public class Circle extends Ellipsis{

    public Circle(String name,double radius){
        super(name,radius);
    }

    @Override
    public double getArea() {
        return pi * (a* a);
    }
    public double getPerimeter(){
        return pi * 2 * a;
    }
}
