package Classroom.LinkedList.SinglyLL;

import java.util.List;

public class SinglyLL {
    public static class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }

        public ListNode() {

        }
    }

    private ListNode head;
    private ListNode tail;
    private int size;

    public SinglyLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        ListNode node = new ListNode(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        ListNode node = new ListNode(value, temp.next);
        temp.next = node;
        size++;
    }

    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    public ListNode insertRec(int value, int index, ListNode node) {
        if (index == 0) {
            ListNode temp = new ListNode(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

    public void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void removeDup() {
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
                size--;
            } else
                temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }

    public void displayI(int i) {
        ListNode temp = head;
        for (int j = 1; j <= i; j++) {
            temp = temp.next;
        }
        System.out.print(temp.value);
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // Calculate the length of cycle present in LL if exist otherwise return 0;
    public int cycleLen(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int len = 0;
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    len++;
                } while (temp != slow);
                return len;
            }
        }
        return 0;
    }

    // LindkedList cycle 2 return the node where the cycle is starting
    public ListNode detectCycle(ListNode head) {
        int len = 0;
        if (hasCycle(head)) {
            len = cycleLen(head);
        } else return null;
        ListNode first = head;
        ListNode sec = head;
        while (len != 0) {
            first = first.next;
            len--;
        }
        while (first != sec) {
            first = first.next;
            sec = sec.next;
        }
        return first;
    }

    // Merge sort in linked list
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while (left != null && right != null) {
            if (left.value < right.value) {
                tail.next = left;
                left = left.next;
                tail = tail.next;
            } else {
                tail.next = right;
                right = right.next;
                tail = tail.next;
            }
        }
        tail.next = (left != null) ? left : right;
        return head.next;
    }

    public ListNode getMid(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseRec(ListNode head) {
        //Your code goes here
        if (head == null || head.next == null) return head;
        ListNode node = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    // Reverse in between a linked list
    public ListNode reverseBet(ListNode head, int left, int right) {
        if (left == right) return head;
        ListNode prev = null;
        ListNode pres = head;

        for (int i = 1; i < left && pres != null; i++) {
            prev = pres;
            pres = pres.next;
        }
        ListNode next = pres.next;
        ListNode last = prev;
        ListNode newEnd = pres;

        for (int i = 0; i < right - left + 1 && pres != null; i++) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) next = next.next;
        }

        if (last != null) last.next = prev;
        else head = prev;
        newEnd.next = pres;
        return head;
    }

    //Append last n nodes to firs
    public ListNode append(ListNode head, int n){
        int count = 0;
        ListNode temp = head;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        temp.next = head;
        ListNode node = head;
        for (int i = 1; i < count-n+1; i++) {
            node = node.next;
        }
        head = node.next;
        node.next = null;
        return head;
    }

    //Check whether the LL is palindrome or not
    public Boolean isLLPal(ListNode head){
        if (head == null || head.next == null)
            return true;
        ListNode midNode = getMid(head);
        ListNode secHead = reverseRec(midNode);
        ListNode revHead = secHead;
        while(head != null && secHead != null){
            if (secHead.value != head.value)
                break;
            head = head.next;
            secHead = secHead.next;
        }
        reverseRec(revHead);
        if (head == null || secHead == null)
            return true;
        return false;
    }

    // Reorder the linked list

    public void reorderLL (ListNode head){
        if (head == null || head.next == null)
            return;
        ListNode mid = getMid(head);
        ListNode hs = reverseRec(mid);
        ListNode hf = head;

        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if (hf != null)
            hf.next = null;
    }
    //Reverse k nodes in linked list
    public ListNode reverseKNode(ListNode head, int k){
        if (k < 2 || head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode pres = head;
        int length = getLen(head);
        int count = length/k;
        if(length%k > 0)
            count++;
        while(count > 0){
            ListNode last = prev;
            ListNode newEnd = pres;
            ListNode next = pres.next;

            for (int i = 0; i < k && pres != null; i++) {
                pres.next = prev;
                prev = pres;
                pres = next ;
                if (next != null )
                    next = next.next;
            }
            if (last != null)
                last.next = prev;
            else
                head = prev;
            newEnd.next = pres;
            prev = newEnd;
            count--;
        }
        return head;
    }

    private int getLen(ListNode head) {
        int len = 0;
        ListNode node = head;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }

    public static ListNode evenAfterOdd(ListNode head  ){
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode head1 = head;
        ListNode tail1 = head1;
        ListNode head2 = head;
        ListNode tail2 = head2;

        while(temp != null){
            if (temp.value % 2 == 1){
                tail1.next = temp;
                tail1 = tail1.next;
            }else{
                tail2.next = temp;
                tail2 = tail2.next;
            }
            temp = temp.next;
        }
        tail1.next = head2.next;
        return head1.next;
    }

    // skip m del n nodes from the linked list
    public static ListNode delMN(ListNode head, int m, int n){
        if (m < 1 || n < 1 || head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode temp = head;
        while(temp != null){
            for (int i = 1; i < m; i++) {
                temp = temp.next;
                if (temp == null)
                    return head;
            }
            ListNode node = temp;
            for (int i = 0; i < n; i++) {
                node = node.next;
                if (node == null){
                    temp.next = null;
                    return  head;
                }
            }
                temp.next = node.next;
                temp = temp.next;
        }
        return head;
    }
    // Swap nodes
    public static ListNode swapNodes(ListNode head, int x, int y) {
        // If x and y are the same, no need to swap
        if (x == y)
            return head;

        // Search for nodes with positions x and y in the linked list
        ListNode prevX = null, currX = head;
        for (int i = 0; i < x && currX != null; i++) {
            prevX = currX;
            currX = currX.next;
        }

        ListNode prevY = null, currY = head;
        for (int i = 0; i < y && currY != null; i++) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, nothing to swap
        if (currX == null || currY == null)
            return head;

        // If x is not the head of the linked list
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        // If y is not the head of the linked list
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        // Swap next pointers to complete the swap
        ListNode temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

    public static void main(String[] args) {
//        SinglyLL list = new SinglyLL();
//        list.insertLast(2);
//        list.insertLast(4);
//        list.insertLast(6);
//        list.insertLast(8);
//        list.insertLast(10);
//        list.insertLast(12);
//        list.insertLast(14);
//        list.display(list.head);
//        ListNode node = list.append(list.head, 4);
//        //ListNode node = list.reverseBet(list.head, 3, 5);
//        // list.reverseRec(list.head);
//        list.display(node);
//
//        SinglyLL list1 = new SinglyLL();
//        list1.insertLast(3);
//        list1.insertLast(2);
//        list1.insertLast(1);
//        list1.insertLast(4);
//        list1.insertLast(9);
//        list1.insertLast(6);
//        ListNode node = list1.getMid(list1.head);
//        System.out.println(node.value);
//        System.out.println(list1.isLLPal(list1.head));

//        SinglyLL myList = new SinglyLL();
//        for (int i = 1; i <=10 ; i++) {
//            myList.insertLast(i);
//        }
//        myList.display(myList.head);
//        ListNode node = myList.reverseKNode(myList.head, 2);
//        myList.display(node);


//        list1.display(list1.head);
//       ListNode node = evenAfterOdd(list1.head);
//       list1.display(node);

        SinglyLL list = new SinglyLL();
        for (int i = 1; i <= 15 ; i++) {
            list.insertLast(i);
        }
        list.display(list.head);
       // ListNode node = list.swapNodes(list.head, 2, 5 );
//        ListNode node = delMN(list.head, 2, 1);
      //  ListNode node = list.reverseKNode(list.head, 15);

        list.display(list.head);
        ListNode node = swapNodes(list.head, 2, 4);
        list.display(node);


    }
}