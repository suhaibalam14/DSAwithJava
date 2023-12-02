package LL.DoublyLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(15);
        list.insertFirst(34);
        list.insertFirst(5);
        list.insertFirst(12);
        list.insertFirst(19);
        list.display();
        list.insertLast(56);
        list.insertLast(78);
        list.insertLast(89);
        list.insertLast(36);
        list.display();
        list.insert(34, 100);
        list.display();
        list.insert(5, 200);
        list.display();
    }
}
