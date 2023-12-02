package Practice.PoLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(15);
        list.insertFirst(16);
        list.insertFirst(17);
        list.insertFirst(14);
        list.insertFirst(13);
        list.insertFirst(19);
        list.display();
        list.insertLast(5);
        list.insertLast(9);
        list.insertLast(4);
        list.insertLast(3);
        list.display();
        list.insert(100,0);
        list.insert(200,11);
        list.display();
        list.insert(2500, 5);
        list.insert(2600, 6);
        list.display();
        System.out.println("cool");
    }



}
