package chapter4.cours.part4;

public class List {
    private class Item{
        private int value;
        private Item next;

        private Item(int value){
            this.value = value;
        }
    }
    private Item start;

    public void addFirst(int i){
        Item j = start;
        start = new Item(i);
        start.next = j;
    }

    public void addLast(int i){
        Item j = start;
        while(j != null){
            if(j.next == null) {
                j.next = new Item(i);
                break;
            }
            j = j.next;
        }
    }

    public void print(){
        Item j = start;
        while(j != null){
            System.out.println(j.value);
            j = j.next;
        }
    }
}
