package chapter4.exercises.exercise2;

public abstract class Geometry3D implements Geometry {
    protected String name;

    public Geometry3D(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Geometry geometry) {
        if(getArea() < geometry.getArea()) return -1;
        else if(getArea() > geometry.getArea()) return 1;
        else return 0;
    }
}
