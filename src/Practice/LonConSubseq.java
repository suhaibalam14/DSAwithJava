package Practice;

import java.util.ArrayList;
import java.util.HashMap;

public class LonConSubseq {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        HashMap<Integer, Integer> lenMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], true);
        }
        int maxLen = 0;
        int maxStart = -1;
        for (int i = 0; i < arr.length; i++) {

            if (map.get(arr[i])) {
                int currStart = arr[i];
                int currLen = 1;
                map.put(arr[i], false);
                int ahead = arr[i] + 1;
                while (true) {
                    if (map.containsKey(ahead)) {
                        map.put(ahead, false);
                        currLen++;
                        ahead++;
                    } else break;
                }
                int before = arr[i] - 1;
                while (true) {
                    if (map.containsKey(before)) {
                        currLen++;
                        currStart = before;
                        map.put(before, false);
                        before--;
                    } else break;
                }
                if (currLen >= maxLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                    lenMap.put(maxStart, maxLen);
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (lenMap.containsKey(arr[i]) && lenMap.get(arr[i]) >= maxLen) {
                maxStart = arr[i];
                maxLen = lenMap.get(arr[i]);
                break;
            }
        }
        list.add(maxStart);
        list.add(maxStart + maxLen - 1);
        return list;
    }

    public static void main(String[] args) {
        //int[] arr = new int[]{2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        //int[] arr = new int[]{3, 7, 2, 1, 9, 8, 41};
        int[] arr = new int[]{6, 3, -1, 2, -4, 3, 1, -2, 20};
        //ArrayList<Integer> list = longestConsecutiveIncreasingSequence(arr);
        //System.out.println(list);
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(sum)) {
                int value = map.get(sum);
                int curr = i - value;
                sum += arr[i];
                map.put(sum, i);
            }

        }
        System.out.println(map);

    }
}
