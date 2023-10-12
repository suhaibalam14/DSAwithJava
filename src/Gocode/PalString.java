package Gocode;

public class PalString {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println(checkPal(str));

    }

    static boolean checkPal(String str) {
        if (str == null || str == "") {
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }

        }

        return true;
    }
}
