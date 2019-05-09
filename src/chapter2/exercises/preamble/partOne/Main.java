package chapter2.exercises.preamble.partOne;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();
        Class5 class5 = new Class5();

        System.out.println(" a =" + class1.a);

        System.out.println(" b =" + class2.b);
        System.out.println(" d =" + class2.d);
        System.out.println(" e =" + class2.e);

        System.out.println(" b = " + class3.b);
        System.out.println(" d = " + class3.d);
        System.out.println(" e = " + class3.e);
        System.out.println(" f = " + class3.f);

        System.out.println(" b = " + class4.b);
        System.out.println(" d = " + class4.d);
        System.out.println(" e = " + class4.e);

        /*
         Class1 Class2 Class3 Class4 Class5
        a  X
        b         X      X      X
        c
        d         X      X      X
        e         X      X      X
        f                X
        */

    }
}
