package rough;

public class Comma {
    public static void main(String[] args) {
    String str = "41 18467 6334 26500 19169 15724 11478 29358 26962 24464 5705 28145 23281 16827 9961 491 2995 11942 4827 5436 32391 14604 3902 153 292 12382 17421 18716 19718 19895 5447 21726 14771 11538 1869 19912 25667 26299 17035 9894 28703 23811 31322 30333 17673 4664 15141 7711 28253 6868 25547 27644 32662 32757 20037 12859 8723 9741 27529 778 12316 3035 22190 1842 288 30106 9040 8942 19264 22648 27446 23805 15890 6729 24370 15350 15006 31101 24393 3548 19629 12623 24084 19954 18756 11840 4966 7376 13931 26308 16944 32439 24626 11323 5537 21538 16118 2082 22929 16541";
        System.out.println(putComma(str));
    }

    public static String putComma(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                str = str.substring(0, i) + ',' + str.substring(i+1);
            }
        }
        return str;
    }
}
