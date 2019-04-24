package chapter4.cours.part3;

public interface Operator<T> extends Comparable<T> {
    default boolean isLess(T t){
        return compareTo(t) < 0;
    }

    default boolean isGreaterOrEqual(T t){
        return !isLess(t);
    }

}
