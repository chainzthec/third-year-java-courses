package chapter2.exercises.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
            if (!marksToRemove.contains(mark1)) {
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

    public float average(int i) {
        float total = 0;
        int totalCoefficient = 0;
        ArrayList<Mark> al = arrayList.get(i);
        for (Mark el : al) {
            total += el.getValue();
            totalCoefficient++;
        }
        return total / totalCoefficient;
    }

    public void add(int i, float v, String c) {
        arrayList.get(i).add(new Mark(v, c));
    }

    public int compute() {
        int maxSize = 0;
        for (int i = 0; i < arrayList.size(); i++)
            if (maxSize < arrayList.get(i).size())
                maxSize = arrayList.get(i).size();
        return maxSize;
    }

    public float[] avgs() {
        float[] marksArray = new float[arrayList.size()];
        int i = 0;
        for (ArrayList<Mark> marks : arrayList) {
            marksArray[i] = average(i);
            i++;
        }
        Arrays.sort(marksArray);
        return marksArray;
    }

    public void showAvgs(float[] avgs){
        for(int i = 0; i < avgs.length; i ++){
            System.out.print(avgs[i]);
            if(i != avgs.length)
                System.out.print(" ");
            else{
                System.out.println();
            }
        }
    }

    public void testHashSet() {
        HashSet hs = new HashSet();
        System.out.println(arrayList.get(0).hashCode());
        System.out.println(arrayList.get(1).hashCode());
        hs.add(arrayList.get(0).get(0));
        hs.add(arrayList.get(1).get(1));
        for(Object obj : hs){
            System.out.println("Class of the object is :" + obj.getClass());
        }
    }
}
