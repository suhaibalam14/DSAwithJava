package Classroom.practice;

public class CompressString {
    static String compress(String str){
        String string ="";
        int i= 0;

        while (i<str.length()){
            int count = countChar(str, str.charAt(i),i);
            if (count<2)
                string = string + str.charAt(i);
            else
                string = string + str.charAt(i) + count;
            i=i+count;
        }
        return string;
    }

    private static int countChar(String str, char c, int x) {
        int count = 0;
        for (int i = x; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
            else
                break;

        }
        return count;
    }

    public static void main(String[] args) {
        String str = "aaabbbcccahhhiiiddk";
        System.out.println(compress(str));
    }
}
