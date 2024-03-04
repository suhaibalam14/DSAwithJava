package Tree.levelWiseLL;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelWiseLL {
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        ArrayList<LinkedListNode<Integer>> list = new ArrayList<>();
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;

        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> btNode = queue.poll();
            if (btNode == null) {
                list.add(head);
                if (!queue.isEmpty())
                    queue.add(null);
                head = null;
                tail = null;
            } else {
                LinkedListNode<Integer> llNode = new LinkedListNode<>(btNode.data);
                if (head == null) {
                    head = llNode;
                    tail = llNode;
                } else {
                    tail.next = llNode;
                    tail = tail.next;
                }
                if (btNode.left != null)
                    queue.add(btNode.left);

                if (btNode.right != null)
                    queue.add(btNode.right);
            }
        }
        return list;
    }

    public static void display(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

        root.left = new BinaryTreeNode<Integer>(2);
        root.right = new BinaryTreeNode<Integer>(3);

        root.left.left = new BinaryTreeNode<Integer>(4);
        root.left.right = new BinaryTreeNode<Integer>(5);

        root.right.left = new BinaryTreeNode<Integer>(6);
        root.right.right = new BinaryTreeNode<Integer>(7);

        root.left.left.left = new BinaryTreeNode<Integer>(8);
        root.left.left.right = new BinaryTreeNode<Integer>(9);

        ArrayList<LinkedListNode<Integer>> list = constructLinkedListForEachLevel(root);
        for (LinkedListNode<Integer> integerLinkedListNode : list) {
            display(integerLinkedListNode);
        }
    }
}