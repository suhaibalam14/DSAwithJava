package OOPs.CheckAccess;

import OOPs.AccessControl.grey;

public class checkProtected extends grey {
    public static void main(String[] args) {
        checkProtected pro = new checkProtected(256, "Excellent", true, 25 , 36);
        System.out.println(pro.greyQuantity);
    }

    int x;

    public checkProtected(int totalColor, String quality, boolean isleft, int gretQuantity, int x) {
        super(totalColor, quality, isleft, gretQuantity);
        this.x = x;

    }
}
