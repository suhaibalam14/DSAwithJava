package LL.SinglyLL;

public class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertFirst(1);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertLast(12);
        list.insertLast(14);
        list.insertLast(17);
        list.insert(55,5);

        list.display();
        System.out.println("Cool");
    }


}
