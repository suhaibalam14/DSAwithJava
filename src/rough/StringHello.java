package rough;

public class StringHello {
    public static void main(String[] args) {
        String str = "hello";
        str = str.substring(0,3) + 'J' + str.substring(4);
        System.out.println(str);
    }
}
