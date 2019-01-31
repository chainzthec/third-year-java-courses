package fourthCourse;

import java.util.Objects;

public class Address {
    int num;
    String sheet;

    public Address(int num,String sheet){
        this.num = num;
        this.sheet = sheet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, sheet);
    }
}
