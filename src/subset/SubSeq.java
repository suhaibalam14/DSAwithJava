package subset;

import java.util.ArrayList;
import java.util.Collections;

public class SubSeq {
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    //subsequence using ArrayList

    static ArrayList<String> subseqret(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqret(p + ch, up.substring(1));
        ArrayList<String> right = subseqret(p, up.substring(1));
        left.addAll(right);
        return left;
    }


    //Subsequence using ArrayList part 2

    static ArrayList<String> remove(String p, String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str.isEmpty()) {
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = remove(p + ch, str.substring(1));
        ArrayList<String> right = remove(p, str.substring(1));
        list.addAll(left);
        list.addAll(right);
        return list;
    }

    public static void main(String[] args) {
       subseq("", "abc");
    }
}
