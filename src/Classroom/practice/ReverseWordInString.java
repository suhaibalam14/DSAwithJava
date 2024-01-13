package Classroom.practice;

public class ReverseWordInString {

    public static String findSpace(String str){
        String s1 = "";
        int s;
        int e = -1;
        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) == ' ' || i == str.length()-1){
                s = e +1;
                e = i;
                if (i == str.length()-1){
                    e = i+1;
                }
               s1 += stringReverse(str.substring(s,e)) + " ";
            }
        }
        return s1;
    }
    public static String stringReverse(String string) {

        int i = string.length()-1;
        String s = "";
        while(i>=0){
            s += string.charAt(i);
            i--;
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "Always indent your code";
        System.out.println(findSpace(str));
    }
}
