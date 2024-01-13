package Classroom.practice;

public class CheckPermutation {
    static  boolean isPer(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        else{
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                int c1 = countChar(s1, ch);
                int c2 = countChar(s2, ch);
                if (c1 != c2){
                    return false;
                }
            }
        }
        return true;
    }
    private static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPer("abc", "cbd"));
    }
}