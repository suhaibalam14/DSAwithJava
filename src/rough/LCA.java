package rough;

public class LCA {



    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if (root == null)
            return -1;
        if (isPresent(root,a) && isPresent(root,b)) {
            if (root.data > a && root.data > b)
                return getLCA(root.left, a, b);

            if (root.data < a && root.data < b)
                return getLCA(root.right, a, b);
            return root.data;
        }
        if (isPresent(root,a) && !isPresent(root,b))
            return a;
        else if (!isPresent(root,a) && isPresent(root,b))
            return b;
        else
            return -1;
    }

    public static boolean isPresent(BinaryTreeNode<Integer> root, int x) {
        if (root == null)
            return false;
        if (root.data == x)
            return true;
        return isPresent(root.left, x) || isPresent(root.right, x);
    }
    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
}