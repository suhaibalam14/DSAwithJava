package LL.DoublyLL;

public class DLL {
    Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null)
            head.prev = node;
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if (head == null){
            node.prev = null;
            node.next = null;
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;

    }
    public void insert(int after, int value){
        Node p = getNode(after);
        if (p == null){
            System.out.print("Does not exist");
            return;
        }
        Node node = new Node(value);
        node.prev = p;
        node.next = p.next;
        p.next = node;
        if (node.next != null)
            node.next.prev = node;
    }

    private Node getNode(int after) {
        Node temp = head;
        while(temp != null){
            if (temp.value == after){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
