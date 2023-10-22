package Classroom;

public class HighestOccurChar {
    static char highestOccurChar(String str){
        if(str.length() == 1)
            return str.charAt(0);
        int count = 0;
        char high = 0;
        for (int i = 0; i < str.length(); i++) {
            int x = count(str, str.charAt(i));
            if (x>count){
                count = x;
                high = str.charAt(i);
            }
        }
        return high;
    }

    private static int count(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(highestOccurChar(str));
    }
}
