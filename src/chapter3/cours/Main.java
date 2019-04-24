package chapter3.cours;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        //1)
        /*
        try {
            Class<?> myClass = Class.forName("chapter3.chapter4.cours.Y");
            while (myClass != null) {
                System.out.println(myClass.getName());
                myClass = myClass.getSuperclass();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        //2)
        /*
        Class<?> classY = Y.class;
        boolean methodExists = false;
        try {
            methodExists = classY.getMethod("print", int.class, int.class) != null;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(methodExists);
        */

        //3) get constructor // new instance
        String s = "<String value=\"toto\"/>";

        String className = s.split(" ")[0].replace("<","");
        Class myClass = null;
        try {
            myClass = Class.forName(className);
            Constructor constructor = myClass.getConstructor(myClass);
            Object instanceOfMyClass = constructor.newInstance();
            instanceOfMyClass.toString();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
