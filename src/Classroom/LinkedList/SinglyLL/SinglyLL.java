package Classroom.LinkedList.SinglyLL;

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
//        list1.insertLast(9);
//        list1.insertLast(1);
//        list1.insertLast(4);
//        list1.insertLast(9);
//        list1.insertLast(3);
//        ListNode node = list1.getMid(list1.head);
//        System.out.println(node.value);
//        System.out.println(list1.isLLPal(list1.head));

        SinglyLL myList = new SinglyLL();
        for (int i = 1; i <=10 ; i++) {
            myList.insertLast(i);
        }
        myList.display(myList.head);
        ListNode node = myList.reverseKNode(myList.head, 2);
        myList.display(node);
    }
}