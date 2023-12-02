package Practice;

public class CompressString {
    public static char highestOccuringChar(String str1,String str2) {
        //Your code goes here



        int count = 0;
        char high = str1.charAt(0);
        for (int i = 0; i < str1.length(); i++) {
            int x = count(str1.charAt(i), str2);
            if (x>count){
                count = x;
                high = str2.charAt(i);
            }
        }
        return high;
    }
    static int count( char c, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
    static  String compressString(String str){
        String string = str.substring(0,1);
        for (int i = 0; i < str.length(); i++) {
            if (!exist(string,str.charAt(i))){
                string += str.charAt(i);
            }
        }
        return string;
    }

    static boolean exist(String string, char c) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
      String string1 = "aabdffghhhdddddidddddddd";
      String string2 = compressString(string1);
        System.out.println(string2);
        System.out.println(highestOccuringChar(string2, string1));
    }
}
