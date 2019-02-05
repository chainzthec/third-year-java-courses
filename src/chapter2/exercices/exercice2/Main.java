package chapter2.exercices.exercice2;

public class Main {
    public static void main(String[] args) {
        Mark mark1 = new Mark(20, "Mathematics");
        Mark mark2 = new Mark(16, "Java Course");
        Mark mark3 = new Mark(11, "C Course");
        Mark mark4 = new Mark(18, "Machine Learning Course");
        Student student = new Student("Jordan", "Michaels");
        student.addMark(mark1);
    }

}
