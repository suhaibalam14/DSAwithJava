package subset;

public class Dice {
    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target && i <= 6; i++) {
            dice(p + i, target - i);

        }
    }

    public static void main(String[] args) {
        dice("", 10);
    }
}
