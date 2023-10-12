package OOPs.AccessControl;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        grey col = new grey(15,"Good", true, 12);
        System.out.println(col.totalColor);
        System.out.println(col.quality);
        System.out.println(col.isleft);
        System.out.println(col.greyQuantity);

        grey col1 = new grey();
        col1.fun();



    }


}
