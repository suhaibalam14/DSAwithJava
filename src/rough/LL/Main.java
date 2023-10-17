package rough.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(15);
        list.insertFirst(16);
        list.insertFirst(17);
        list.insertFirst(10);
        list.display();
        list.insertLast(25);
        list.insertLast(6);
        list.insertLast(5);
        list.display();
        list.insert(100,2);
        list.display();
    }
}
