package chapter4.cours.part3;

public class Student implements Operator<Student>{

    private int id;

    public int compareTo(Student s){
        return id - s.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
