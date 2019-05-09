package chapter4.exercises.exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //a)
        Circle c = new Circle("Circle1",2.5);
        Cylinder cy = new Cylinder("Cylinder1", 2.0,3.0);
        Ellipsis el = new Ellipsis("Ellipsis1", 2.0, 15.0);
        Rectangle re = new Rectangle("Rectangle1", 2.0,3.0);
        Sphere sp = new Sphere("Sphere1", 2.0);
        Square sq = new Square("Square1", 2.0);

        System.out.println("Circle values :");
        System.out.println("    Perimeter = " + c.getPerimeter());
        System.out.println("    Surface = " +c.getArea());
        System.out.println("Cylinder values :");
        System.out.println("    Surface = " +cy.getArea());
        System.out.println("    Volume = " +cy.getVolume());
        System.out.println("Ellipsis values :");
        System.out.println("    Surface = " +el.getArea());
        System.out.println("Rectangle values :");
        System.out.println("    Perimeter = " +re.getPerimeter());
        System.out.println("    Surface = " +re.getArea());
        System.out.println("Sphere values :");
        System.out.println("    Surface = " +sp.getArea());
        System.out.println("Square values :");
        System.out.println("    Perimeter = " +sq.getPerimeter());
        System.out.println("    Surface = " +sq.getArea());

        System.out.println("Rectangle area = " + re.getArea());
        System.out.println("Square area = " + sq.getArea());
        System.out.println("Comparison between rectangle and square = " + ((re.compareTo(sq) == -1) ? "square area > rectangle area" : (re.compareTo(sq) == 1) ? "rectangle area > square area" : "rectangle area == square area"));

        //b)
        List<Geometry2D> list = Arrays.asList(
            new Circle("Circle2",2.5),
            new Ellipsis("Ellipsis2", 2.0, 15.0),
            new Rectangle("Rectangle2", 2.0,3.0),
            new Square("Square2", 2.0)
        );

        System.out.println("Before sort : ");
        list.stream().forEach((e) -> System.out.println(e.name+ " " + e.getArea()));
        Collections.sort(list);
        System.out.println("After sort : ");
        list.stream().forEach((e) -> System.out.println(e.name+ " " + e.getArea()));

    }
}
