package Tree.GenericTree;

import java.util.ArrayList;

public class GenericTree {

    static class TreeNode {
        int data;
        ArrayList<TreeNode> children;

        public TreeNode(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    static class Pair {
        TreeNode node;
        int sum;

        public Pair(TreeNode node, int sum) {
            this.node = node;
            this.sum = sum;
        }
    }

    public static Pair helper(TreeNode root) {
        // Write your code here
        if (root == null)
            return new Pair(null, 0);
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i));
        }
        int sum = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            sum += root.children.get(i).data;
        }
        if (sum > maxSum) {
            maxSum = sum;
        }
        return new Pair(root, maxSum);
    }

    public static TreeNode findNextLargerNode(TreeNode root, int n) {

        // Write your code here
        if (root == null)
            return null;
        TreeNode ans = null;
        if (root.data > n)
            ans = root;
        TreeNode temp = null;
        for (int i = 0; i < root.children.size(); i++) {
            temp = findNextLargerNode(root.children.get(i), n);
        }
        assert ans != null;
        assert temp != null;
        if (ans.data < temp.data)
            return ans;
        else
            return temp;
    }

    public static TreeNode largestNumber(TreeNode root) {
        if (root == null)
            return null;

        TreeNode maxNode = root;

        for (int i = 0; i < root.children.size(); i++) {

            TreeNode childNode = largestNumber(root.children.get(i));

            if (maxNode.data < childNode.data)
                maxNode = childNode;

        }
        return maxNode;
    }


    public static ArrayList<Integer> longSeq(int[] arr) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        // Level 1
        root.children.add(new TreeNode(10));
        root.children.add(new TreeNode(10));
        root.children.add(new TreeNode(40));

        // Level 2
        root.children.get(0).children.add(new TreeNode(50));
        root.children.get(0).children.add(new TreeNode(60));

        root.children.get(1).children.add(new TreeNode(70));

        root.children.get(2).children.add(new TreeNode(80));
        root.children.get(2).children.add(new TreeNode(90));
        root.children.get(2).children.add(new TreeNode(90));

        TreeNode x = largestNumber(root);
        x.data = 0;
        System.out.println(largestNumber(root).data);
    }
}
