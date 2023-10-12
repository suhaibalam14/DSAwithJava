package recursion;

import java.util.ArrayList;

public class LinearSearch {

    //Returning if the target element is present in the given array or not
    static boolean search(int[] arr, int target, int index){
        if (index == arr.length)
            return false;
        return target == arr[index] || search(arr,target, index+1);
    }

    //finding the index of target element
    static int search1(int[] arr, int target, int index){
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;
        return search1(arr, target, index+1);
    }

    //finding the index of target element from back
    static int search2(int[] arr, int target, int index){
        if (index == -1)
            return -1;
        if (arr[index] == target)
            return index;
        return search2(arr, target, index-1);
    }
    //Finding all repearted target elements and storing them into an  static ArrayList
    static ArrayList<Integer> list = new ArrayList<>();
    static void search3(int[] arr, int target, int index){
        if (index == arr.length)
            return;
        if (arr[index] == target)
            list.add(index);
        search3(arr, target, index+1);
    }

    //Finding all repeated target element and returing an ArrayList
    static ArrayList<Integer> search4(int[] arr , int target, int index, ArrayList<Integer> list){
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        return search4(arr, target, index+1, list);
    }

    //finding all repeated target elements and returning an ArrayList but can't pass ArrayList as an argument
    static ArrayList<Integer> search5(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;
        if (arr[index] == target)
            list.add(index);
        ArrayList<Integer> allAnswer = search5(arr, target, index+1);
        list.addAll(allAnswer);
        return list;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,5,4,9,7,4,8,10};
//        System.out.println(search(arr, 4, 0));
//        System.out.println(search1(arr, 4, 0));
//        System.out.println(search2(arr, 4, arr.length-1));
//          search3(arr, 4,0);
//        System.out.println(list);
//        System.out.println(search4(arr, 4, 0, new ArrayList<>()));
        System.out.println(search5(arr, 4, 0));


    }

}
