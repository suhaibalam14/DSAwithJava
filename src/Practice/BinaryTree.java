package Practice;

public class BinaryTree {
    BinaryTreeNode<Integer> root;

    public void insert(int data) {
        //Implement the insert() function
        root = insertHelper(root, data);
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return new BinaryTreeNode<>(data);
        }
        if (data < root.data) {
            root.left = insertHelper(root.left, data);
        } else {
            root.right = insertHelper(root.right, data);
        }
        return root;
    }

    private static BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return null;
        if (data < root.data) {
            root.left = removeHelper(root.left, data);
            return root;
        }
        if (data >= root.data) {
            root.right = removeHelper(root.right, data);
            return root;
        }
        if (root.left == null && root.right == null) {
            return null;
        } else if (root.left != null && root.right == null) {
            return root.left;
        } else {
            int minNodeData = minimum(root.right);
            root.data = minNodeData;
            root.right = removeHelper(root.right, minNodeData);
            return root;
        }

    }

    private static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null)
            return Integer.MAX_VALUE;
        int leftAns = minimum(root.left);
        int rightAns = minimum(root.right);
        return Math.min(root.data, Math.min(leftAns, rightAns));
    }

    public void remove(int data) {
        //Implement the remove() function
        root = removeHelper(root, data);
    }

    public void printTree() {
        //Implement the printTree() function
        printHelper(root);
    }

    public static void printHelper(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        System.out.println(root.data + " ");
        if (root.left != null)
            System.out.println("L:" + root.left.data + ",");
        if (root.right != null)
            System.out.println("R:" + root.right.data);
        System.out.println();
        printHelper(root.left);
        printHelper(root.right);
    }

    public boolean search(int data) {
        //Implement the search() function
        return isPresent(root, data);
    }

    public static boolean isPresent(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return false;
        if (root.data == data)
            return true;
        if (data < root.data) {
            return isPresent(root.left, data);
        } else {
            return isPresent(root.right, data);
        }
    }

    public static void main(String[] args) {

    }
}
