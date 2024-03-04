package rough;

import Classroom.LinkedList.SinglyLL.SinglyLL;
import Practice.Arrays.IdentifyNumber;

public class Node<T> {
    T data;
    Node<T> next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    public static void display(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        //Your code goes here
        if (i == j)
            return head;

        Node<Integer> prevX = null, presX = head;

        for (int k = 0; k < i && presX != null; k++) {
            prevX = presX;
            presX = presX.next;
        }

        Node<Integer> prevY = null, presY = head;

        for (int k = 0; k < i && presY != null; k++) {
            prevY = presY;
            presY = presY.next;
        }

        if (presX == null || presY == null)
            return head;

        if (prevX != null)
            prevX.next = presY;


        if (prevY != null)
            prevY.next = presX;

        Node<Integer> temp = presX.next;
        presX.next = presY.next;
        presY.next = temp;

        return head;
    }

    public static Node<Integer> bubbleSort(Node<Integer> head) {

        {
            if (head == null || head.next == null)
                return head;
            //Write your code here
            for (int i = 1; i < 6; i++) {
                Node<Integer> prev = null;
                Node<Integer> curr = head;
                Node<Integer> next = curr.next;

                while (curr.next != null) {
                    if (curr.data > curr.next.data) {
                        if (prev == null) {
                            curr.next = next.next;
                            next.next = curr;
                            prev = next;
                            head = prev;
                        } else {
                            next = curr.next;
                            curr.next = next.next;
                            prev.next = next;
                            next.next = curr;
                            prev = next;
                        }
                    } else {
                        prev = curr;
                        curr = curr.next;
                    }
                }
            }
            return head;
        }
        // Bubble sort in Linked List
//    public static Node<Integer> bubbleSort(Node<Integer> head){
//        if (head == null || head.next ==null)
//            return head;
//        Node<Integer> temp = head;
//        for (int i = 0; i < 6; i++) {
//            Node<Integer> prev = null;
//            Node<Integer> pres = head;
//            Node<Integer> next = pres.next;
//            while(pres.next != null){
//                if (pres.data > pres.next.data){
//                    if (prev != null){
//                        pres.next = next.next;
//                        prev.next = next;
//                        next.next = pres;
//                        next = pres.next;
//                        prev = next;
//                    }else{
//                        pres.next = next.next;
//                        next.next = pres;
//                        next = pres.next;
//                        prev = next;
//                        head = prev;
//                    }
//                }else{
//                    prev = pres;
//                    pres = pres.next;
//                    if (next != null)
//                        next = next.next;
//                }
//            }
//        }
//        return head;
//    }
    }
        public static void main (String[] args){
            Node<Integer> node = new Node<>(6);
            Node<Integer> node1 = new Node<>(5);
            Node<Integer> node2 = new Node<>(4);
            Node<Integer> node3 = new Node<>(3);
            Node<Integer> node4 = new Node<>(2);
            Node<Integer> node5 = new Node<>(1);
            node.next = node1;
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;
            node5.next = null;
            display(node);
            //Node<Integer> temp = swapNodes(node, 2, 4 );
            Node<Integer> temp = bubbleSort(node);

            display(temp);
        }
    }