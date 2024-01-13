package Classroom.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 5, 0, 6, 4, 0, 0, 0, 3, 5, 6, 6, 9));
        pushZerosAtEnd(list);


    }

    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
        int[] nums = new int[arr.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(push(nums)));
    }

    private static int[] push(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int getZero = zero(nums, last);
            swap(nums, last, getZero);

        }
        return nums;
    }

    private static int zero(int[] nums, int e) {
        int zero = 1;
        for (int i = 0; i <= e; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }
        return zero;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
