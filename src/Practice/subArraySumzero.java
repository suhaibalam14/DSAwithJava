package Practice;

import java.util.HashMap;

public class subArraySumzero {
    public static int lengthOfLongestSubsetWithZeroSum(int[] arr) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = arr[0];
        int maxL = 0;

        for (int i = 0; i < arr.length; i++) {
            int currL = 0;
            if(map.containsKey(sum)){
                int value =  map.get(sum);
                currL = i - value;
                sum += arr[i];
            }else
                map.put(sum, i);
            if(currL > maxL)
                maxL = currL;
        }
        return maxL;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{ 95, -97, -387, -435, -5, -70, 897, 127, 23, 284};
        System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
    }
}
