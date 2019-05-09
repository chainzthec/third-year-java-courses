package chapter4.exercises.exercise2;

public class Square extends Rectangle {


    public Square(String name,double width){
        super(name,width);
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }
}
