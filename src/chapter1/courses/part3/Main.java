package chapter1.courses.part3;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(242, "Rue du Faubourg Saint-Antoine");
        Address address1 = null;

        try {
            address1 = (Address) address.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(address.hashCode());
        if (address1 != null)
            System.out.println(address1.hashCode());


    }
}
