package Array;

import java.util.Stack;

public class HistogramLargestArea {

    //DIY
    public static int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int area;
            area = heights[i] * span(heights, i);
            if (area > max)
                max = area;
        }
        return max;
    }

    private static int span(int[] heights, int i) {
        int leftSpan = 0;
        int rightSpan = 0;
        for (int j = i; j >= 0; j--) {
            if (heights[j] >= heights[i])
                leftSpan++;
            else
                break;
        }
        for (int j = i; j < heights.length; j++) {
            if (heights[i] <= heights[j])
                rightSpan++;
            else
                break;
        }
        return leftSpan + rightSpan - 1 ;
    }

    public static int largestArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }
        int i = heights.length;
        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }
        return max;
    }

    private static int getMax(int[] heights, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        if (stack.isEmpty())
            area = heights[popped] * i;
        else
            area = heights[popped] * (i - 1 - stack.peek());
        return Math.max(area, max);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
        System.out.println(largestArea(arr));
        System.out.println(largestRectangleArea(arr));
    }
}
