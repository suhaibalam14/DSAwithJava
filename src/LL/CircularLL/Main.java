package LL.CircularLL;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(45);
        list.insert(4);
        list.insert(5);
        list.insert(8);
        list.insert(87);
        list.insert(2);
        list.display();
        list.delete(45);
        list.delete(87);
        list.display();
    }
}
