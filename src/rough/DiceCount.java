package rough;

import java.util.ArrayList;

public class DiceCount {
    static void diceCount (String p, int target){
        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target && i<=6 ; i++) {
            diceCount(p+i, target-i);
        }
    }


    //Storing all possible outcomes in an ArrayList
    static ArrayList<String> diceCountRet(String p, int target){
        if (target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target ; i++) {
            list.addAll(diceCountRet(p+i, target-i));
        }
        return list;
    }

    public static void main(String[] args) {
       diceCount("", 3);
       // System.out.println(diceCountRet("", 5));
    }
}
