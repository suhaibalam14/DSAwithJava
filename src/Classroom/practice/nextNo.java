package Classroom.practice;

public class nextNo {
    public static class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
        public static Node nextNo(Node head) {
            Node pres = head;
            Node last = null;

            while (pres.next != null) {
                if (pres.val != 9) last = pres;
                pres = pres.next;
            }
            if (pres.val != 9) {
                pres.val++;
                return head;
            }
            if (last == null) {
                last = new Node(0);
                last.next = head;
                head = last;
            }
            last.val++;
            last = last.next;
            while (last != null) {
                last.val = 0;
                last = last.next;
            }
            return head;
        }

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.println("End");
        }

        public static void main(String[] args) {
            Node node = new Node(9);
            Node node1 = new Node(0);
            Node node2 = new Node(0);
            Node node3 = new Node(0);
            Node node4 = new Node(9);
            node.next = node1;
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            display(node);
            Node temp = nextNo(node);
            display(temp);
        }
    }

}
