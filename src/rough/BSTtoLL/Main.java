package rough.BSTtoLL;

import Practice.PoLL.LL;

public class Main extends LLNode<Integer> {
    public static LLNode<Integer> constructLinkedList(BSTNode<Integer> root) {
        if (root == null)
            return null;
        LLNode<Integer> head = new LLNode<>();
        helper(root, head);
        return head.next;
    }

    private static LLNode<Integer> helper(BSTNode<Integer> root, LLNode<Integer> node) {
        if(root.left != null)
            node = helper(root.left, node);
        node = addNode(root, node);
        if(root.right != null)
            node = helper(root.right, node);
        return node;
    }

    private static LLNode<Integer> addNode(BSTNode<Integer> root, LLNode<Integer> node) {
        LLNode<Integer> newNode = new LLNode<>(root.data);
        node.next = newNode;
        return newNode;
    }

    public static void main(String[] args) {
//        BSTNode<Integer> root = new BSTNode<>(20);
//        root.left = new BSTNode<>(10);
//        root.right = new BSTNode<>(30);
//
//        root.left.left = new BSTNode<>(5);
//        root.left.right = new BSTNode<>(15);
//
//        root.right.left = new BSTNode<>(25);
//        root.right.right = new BSTNode<>(35);
//
//        root.left.left.left = new BSTNode<>(2);
//        root.left.left.right = new BSTNode<>(7);
//
//        root.left.right.left = new BSTNode<>(12);
//        root.left.right.right = new BSTNode<>(18);
//
//        root.right.left.left = new BSTNode<>(22);
//        root.right.left.right = new BSTNode<>(27);
//
//        root.right.right.left = new BSTNode<>(32);
//        root.right.right.right = new BSTNode<>(40);
        BSTNode<Integer> root = new BSTNode<>(8);
        root.left = new BSTNode<>(5);
        root.right = new BSTNode<>(10);

        root.left.left = new BSTNode<>(2);
        root.left.right = new BSTNode<>(6);

        LLNode<Integer> node = constructLinkedList(root);
        display(node);
    }
}
