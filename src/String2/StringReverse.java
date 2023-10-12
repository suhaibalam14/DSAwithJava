package String2;

public class StringReverse {
    static String reverse(String p, String up){
        if (up.isEmpty())
            return p;
        char ch = up.charAt(up.length()-1);
        return reverse(p+ ch, up.substring(0,up.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(reverse("", "hello"));

    }
}
