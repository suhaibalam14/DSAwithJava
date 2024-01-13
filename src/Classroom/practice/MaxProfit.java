package Classroom.practice;

import java.util.Arrays;

public class MaxProfit {
    public static int maximumProfit(int[] budget, int index) {
        // Write your code here
        Arrays.sort(budget);
        int n = budget.length;
        if (n < index)
            return 0;
        int profit = (n - index) * budget[index];
        if (index == 0)
            return profit;
        return Math.max(profit, maximumProfit(budget, index - 1));
    }


    public static int maximumProfit(int[] budget) {
        // Write your code here

        return maximumProfit(budget, budget.length - 1);
    }


    public static void main(String[] args) {
        int[] budget = new int[]{34, 78, 90, 15, 67};
        int result = maximumProfit(budget);
        System.out.println("Maximum Profit: " + result);
    }
}
