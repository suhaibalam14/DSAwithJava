package rough;

import java.util.ArrayList;

public class GenericTree {
    public class Node{
        int data;
        ArrayList<Node> children;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node sLargestNode(Node root){
        if (root == null)
            return null;
        Node max = root;
        Node sMax = root;
        if (root.data > max.data){
            max = root;
        }else if (root.data > sMax.data && root.data != max.data){
            sMax = root;
        }
        for (int i = 0; i < root.children.size(); i++) {
            sLargestNode(root.children.get(i));
        }
        return sMax;
    }
}
