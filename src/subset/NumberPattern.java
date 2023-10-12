package subset;

import java.util.ArrayList;

public class NumberPattern {
    static void numPattern(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            numPattern(p + ch, up.substring(1));

        }
    }

    static ArrayList<String> numPatternret(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            list.addAll(numPatternret(p + ch, up.substring(1)));
        }
        return list;
    }

    static int numPatternCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            count = count + numPatternCount(p + ch, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        numPattern("", "12");
        ArrayList<String> list = numPatternret("", "12");
        System.out.println(list);
        int count = numPatternCount("", "12");
        System.out.println(count);
    }
}
