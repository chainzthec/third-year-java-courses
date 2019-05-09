package chapter1.course.part3;

import java.util.Objects;

public class Address implements Cloneable {
    int num;
    String sheet;
    private Address address;

    public Address(int num, String sheet) {
        this.num = num;
        this.sheet = sheet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, sheet);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Address(num, sheet);
    }
}
