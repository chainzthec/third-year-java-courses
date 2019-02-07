package chapter2.exercices.exercice2;

import java.util.ArrayList;

public class Application {

    private ArrayList<ArrayList<Mark>> arrayList;

    Application() {
        this.arrayList = new ArrayList<>();
        ArrayList<Mark> student1Marks = new ArrayList<>();
        ArrayList<Mark> student2Marks = new ArrayList<>();
        student1Marks.add(new Mark(20, "Mathematics Course"));
        student1Marks.add(new Mark(18, "C Course"));
        student2Marks.add(new Mark(16, "Mathematics Course"));
        student2Marks.add(new Mark(13, "Mathematics Course"));
        student2Marks.add(new Mark(18, "C Course"));
        student2Marks.add(new Mark(17, "Java Course"));
        student2Marks.add(new Mark(15, "Big Data Course"));
        mergeMarks(student1Marks);
        mergeMarks(student2Marks);
        this.arrayList.add(student1Marks);
        this.arrayList.add(student2Marks);
    }

    void print() {
        int i = 1;
        int j;
        for (ArrayList<Mark> al : arrayList) {
            j = 1;
            System.out.println("Student " + i + " : ");
            for (Mark mark : al) {
                System.out.println("     Mark " + j + " subject : " + mark.getSubject());
                System.out.println("     Mark " + j + " value : " + mark.getValue());
                j++;
            }
            i++;
        }
    }

    private void mergeMarks(ArrayList<Mark> marks) {
        float value;
        ArrayList<Mark> marksToRemove = new ArrayList<>();
        for (Mark mark1 : marks) {
            if(!marksToRemove.contains(mark1)) {
                for (Mark mark2 : marks) {
                    if (!mark1.equals(mark2) && mark1.getSubject().equals(mark2.getSubject())) {
                        value = (mark1.getValue() + mark2.getValue()) / 2;
                        mark1.setValue(value);
                        marksToRemove.add(mark2);
                    }
                }
            }
        }
        //To avoid concurrency
        for (Mark markToRemove : marksToRemove) {
            marks.remove(markToRemove);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
