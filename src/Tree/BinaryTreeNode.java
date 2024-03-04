package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    public BinaryTreeNode(int data) {
        this.data = data;
    }
    public class Pair {
        int minimum;
        int maximum;

        public Pair(int minimum, int maximum) {
            this.minimum = minimum;
            this.maximum = maximum;
        }
    }
    public static class Quad{
        int min;
        int max;
        boolean isBST;
        int height;

        public Quad(int min, int max, boolean isBST, int height){
            this.min = min;
            this.max = max;
            this.isBST = isBST;
            this.height= height;
        }
    }
    public static Quad largestBSTSubtree(BinaryTreeNode root){
        if(root == null)
            return new Quad(Integer.MAX_VALUE, Integer.MIN_VALUE, true, 0);
        Quad left = largestBSTSubtree(root.left);
        Quad right = largestBSTSubtree(root.right);

        boolean isBST = root.data > left.max && root.data <= right.min && left.isBST && right.isBST;
        int height;
        if(isBST)
            height = 1 + Math.max(left.height, right.height);
        else
            height = Math.max(left.height, right.height);
        return new Quad(Math.min(left.min, root.data), Math.max(root.data, right.max), isBST, height);
    }
    public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public static BinaryTreeNode takeInput() {
        System.out.println("Enter root data :-");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1) return null;
        BinaryTreeNode root = new BinaryTreeNode(rootData);
        BinaryTreeNode leftChild = takeInput();
        BinaryTreeNode rightChild = takeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
    public static void display(BinaryTreeNode root) {
        if (root == null) return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);

    }
    public static int sumOfAllNodes(BinaryTreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.data;
        return root.data + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);

    }
    public static void printLevelWises(BinaryTreeNode root) {
        if (root == null) return;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }
    public static void printLevelWise(BinaryTreeNode root) {
        //Your code goes here
        if (root == null) return;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            BinaryTreeNode nodeX = queue.peek();
            if (node == nodeX) return;
            if (node != null) {
                System.out.print(node.data + " ");
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            } else {
                System.out.println();
                queue.add(null);
            }

        }
    }
    public static int countNodeGreaterthanX(BinaryTreeNode root, int x) {
        if (root == null) return 0;
        if (root.data > x) return 1 + countNodeGreaterthanX(root.left, x) + countNodeGreaterthanX(root.right, x);
        else return countNodeGreaterthanX(root.left, x) + countNodeGreaterthanX(root.right, x);
    }
    public static void printNodesWithoutSibling(BinaryTreeNode root) {
        if (root == null) return;
        if (root.left == null) if (root.right != null) System.out.println(root.right.data);

        if (root.right == null) if (root.left != null) System.out.println(root.left.data);

        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
    public  Pair getMinAndMax(BinaryTreeNode root) {
        //Your code goes here
        if (root == null) return new Pair(0, 0);
        Pair leftAns = getMinAndMax(root.left);
        Pair rightAns = getMinAndMax(root.right);
        int max = Math.max(Math.max(leftAns.maximum, rightAns.maximum), root.data);
        int min = Math.min(Math.min(leftAns.minimum, rightAns.minimum), root.data);
        return new Pair(min, max);
    }
    public static void pathSumRTL(BinaryTreeNode root, int k) {
        pathSumRTL(root, k, "");
    }
    public static void pathSumRTL(BinaryTreeNode root, int k, String str) {
        if (root == null) return;
        if (root.left == null && root.right == null && root.data == k) {
            System.out.println(str + root.data);
            return;
        }
        pathSumRTL(root.left, k - root.data, str + root.data + " ");
        pathSumRTL(root.right, k - root.data, str + root.data + " ");

    }
    public static void pairSum(BinaryTreeNode root, int sum) {
        if (root == null) return;
        Stack<BinaryTreeNode> stk1 = new Stack<>();
        Stack<BinaryTreeNode> stk2 = new Stack<>();
        BinaryTreeNode node1 = root;
        BinaryTreeNode node2 = root;
        while (true) {

            while (node1 != null) {
                stk1.push(node1);
                node1 = node1.left;
            }
            while (node2 != null) {
                stk2.push(node2);
                node2 = node2.right;
            }

            int x = stk1.peek().data;
            int y = stk2.peek().data;

            if (x > y)
                return;

            if (x + y == sum) {
                System.out.println(x + " " + y);
                node1 = stk1.pop().right;
                node2 = stk2.pop().left;
            }
            if (x + y < sum)
                node1 = stk1.pop().right;

            if (x + y > sum)
                node2 = stk2.pop().left;

        }
    }
    private static int size(BinaryTreeNode root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(5);
        root.left = new BinaryTreeNode(10);
        root.right = new BinaryTreeNode(6);
        root.left.left = new BinaryTreeNode(2);
        root.left.right = new BinaryTreeNode(3);
        root.left.right.right = new BinaryTreeNode(9);

        // printLevelWise(root);
//        display(root);
//        printLevelWise(root);
//        System.out.println(sumOfAllNodes(root));
        //  printNodesWithoutSibling(root);
//       Pair  p =  getMinAndMax(root);
//        System.out.println(p.maximum);
//        System.out.println(p.minimum);
      //  pairSum(root, 13);
        Quad result = largestBSTSubtree(root);
        System.out.println("min: " + result.min + ", max: " + result.max + ", isBST: " + result.isBST + ", height: " + result.height);
        System.out.println(result.height);
    }
}
