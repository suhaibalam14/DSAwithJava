package LL.SinglyLL;


public class SinglyLL {

    private  Node head;
    private  Node tail;
    private int size;

    public SinglyLL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if (tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail= node;
        size++;
    }

    public void insert(int value, int index){
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }
    private Node insertRec(int value, int index, Node node){
        if (index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == tail)
            tail = null;
        size--;
        return  value;
    }

    public int deleteLast(){
        if (size<= 1)
            return deleteFirst();
        Node secondLast = getNode(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }
    public int delete(int index){
        if (index == 0)
            return  deleteFirst();
        if (index == size-1)
            return deleteLast();
        Node prev = getNode(index -1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }
    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if (temp.value == value)
                return temp;
        }
        temp = temp.next;
        return  null;
    }

    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void removeDuplicates(){
        Node node = head;
        while(node.next != null){
            if (node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    public static SinglyLL mergeTwo(SinglyLL list1, SinglyLL list2){
        Node node1 = list1.head;
        Node node2 = list2.head;
        SinglyLL list3 = new SinglyLL();
        while (node1 != null && node2 != null){
            if (node1.value < node2.value){
                list3.insertLast(node1.value);
                node1 = node1.next;
            }else{
                list3.insertLast(node2.value);
                node2 = node2.next;
            }
        }
        while(node1 != null){
            list3.insertLast(node1.value);
            node1 = node1.next;
        }
        while(node2 != null){
            list3.insertLast(node2.value);
            node2 = node2.next;
        }
        return list3;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        private  int value;
        private  Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
//        SinglyLL list = new SinglyLL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(4);
//        list.display();
//        list.removeDuplicates();
//        list.display();

        SinglyLL list1 = new SinglyLL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(5);
        list1.insertLast(9);
        list1.insertLast(56);
        list1.insertLast(87);

        SinglyLL list2 = new SinglyLL();
        list2.insertLast(1);
        list2.insertLast(5);
        list2.insertLast(8);
        list2.insertLast(10);
        list2.insertLast(18);
        list2.insertLast(28);
        list2.insertLast(34);
        list2.insertLast(62);

        SinglyLL list3 = SinglyLL.mergeTwo(list1, list2);
        list3.display();

    }
}
