package fourthCourse;

import java.util.Objects;

public class Student {

    private String name;
    private double chiffre;

    public Student(String name, double chiffre) {
        this.name = name;
        this.chiffre = chiffre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.chiffre, chiffre) == 0 &&
                Objects.equals(name, student.name);
    }
}
