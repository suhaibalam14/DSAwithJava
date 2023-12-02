package String2;

public class minLenWord {
    public static String minLen(String input){
        String str1 = input;
        String str2;
        int s = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' || i == input.length()-1){
                str2 = input.substring(s, i);
                if (i == input.length()-1)
                    str2 = input.substring(s, i+1);
                s= i+1;
                if (str2.length() < str1.length()){
                    str1 = str2;
                }
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        String str = "aqwdqwd abwqdqwd bkjfkljrlfjlekrf cewfwef dewfwefw ewdwqd fqsqs gefewf hwefwef iewf jewf kewfwef lwded2e ba";
        System.out.println(minLen(str));
    }
}
