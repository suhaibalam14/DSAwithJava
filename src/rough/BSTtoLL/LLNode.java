package rough.BSTtoLL;

import LL.SinglyLL.SinglyLL;

public class LLNode<T> {
    T data;
    LLNode<T> next;

    public LLNode(T data) {
        this.data = data;
    }
    public LLNode(){}
    public static void display(LLNode<Integer> head){
        LLNode<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
