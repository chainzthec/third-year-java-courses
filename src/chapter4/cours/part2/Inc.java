package chapter4.cours.part2;

public class Inc implements Compute {

    @Override
    public int treatment(int x) {
        return ++x;
    }
}
