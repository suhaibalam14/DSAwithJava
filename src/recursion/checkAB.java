package recursion;

public class checkAB {
    static boolean checkAb(String str){
        if(!str.startsWith("a"))
            return false;
        return check(str);
    }

    private static boolean check(String str) {
        if (str.charAt(0) == '\0')
            return true;
        if (str.startsWith("a")){
            if (str.charAt(1) != 'a' || str.substring(1,3) != "bb" || (str.charAt(1) == '\0'))
               return false;
        }
        if (str.startsWith("bb")){
            if (str.charAt(1) != 'a' || (str.charAt(1) != '\0'))
               return false;
        }
       return checkAb(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "abb";
        System.out.println(checkAb(str));
    }
}
