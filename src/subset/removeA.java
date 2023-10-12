package subset;

public class removeA {

    //Removing character from a string
    static void check1(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
         char ch = up.charAt(0);
        if (ch == 'a')
            check1(p, up.substring(1));
        else
            check1(p+ch, up.substring(1));
    }

//Removing a character from the string and returning it
    static String check2(String str){
        if (str.isEmpty())
            return "";
        char ch = str.charAt(0);
        if(ch == 'a'){
            return  check2(str.substring(1));
        }else{
            return ch + check2(str.substring(1));
        }
    }

    // Removing a substring

    static String check3(String str){
        if (str.isEmpty())
            return str;
        if (str.startsWith("apple"))
            return check3(str.substring(5));
        else
            return str.charAt(0) + check3(str.substring(1));
    }

    static String check22(String p, String up){
        if (up.isEmpty())
            return p;
        if (up.startsWith("apple"))
            return check22(p, up.substring(5));
        else
            return up.charAt(0) + check22(p, up.substring(1));
    }
    //Remove app not apple
    static String check4(String str){
        if (str.isEmpty())
            return str;
        if(str.startsWith("app")&& !str.startsWith("apple")) {
            return check4(str.substring(3));
        }
        else {
            return str.charAt(0) + check4(str.substring(1));
        }
    }



    public static void main(String[] args) {
        System.out.println(check22("", "bacapplecdah"));
    }
}
