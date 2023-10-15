package Classroom;

public class PairSum {

        public static int pairSum(int arr[], int x) {
            //Your code goes here
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    for (int k = j+1; k < arr.length; k++) {
                        if(arr[i]+arr[j]+arr[k] == x)
                            count++;
                    }
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6 ,7
        };

        System.out.println(pairSum(arr,12));
    }
    }
