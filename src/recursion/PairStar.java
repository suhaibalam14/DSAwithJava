package recursion;

public class PairStar {

    // Return the updated string
    public static String addStars(String s) {
        // Write your code here
        return helper("", s);
    }
    static String helper(String p, String up){
        if(up.length() == 1)
            return p+up;
        if(up.charAt(0) == up.charAt(1))
            return helper(p + up.charAt(0) + '*', up.substring(1));
        else
            return helper(p + up.charAt(0), up.substring(1));
    }

    public static void main(String[] args) {
        String str = "aabbddkkiirr";
        System.out.println(addStars(str));
    }
}
