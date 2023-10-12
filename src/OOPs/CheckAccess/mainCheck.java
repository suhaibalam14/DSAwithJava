package OOPs.CheckAccess;

public class mainCheck {
    public static void main(String[] args) {
        checkProtected pro = new checkProtected(256, "Excellent", true, 25, 26);
        System.out.println(pro.totalColor);
        System.out.println(pro.greyQuantity);
    }


}
