package Classroom;

public class RemoveConDup {
    static String remove(String str){
        String string = str.substring(0,1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != string.charAt(string.length()-1)){
                string += str.charAt(i);
            }
        }
        return string;
    }

    public static void main(String[] args) {
        String str = "aaaabbbcccddd";
        System.out.println(remove(str));
    }
}
