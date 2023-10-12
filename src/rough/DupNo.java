package rough;

public class DupNo {
    static int dupNumber( int[] arr){

        if (arr.length == 0|| arr.length ==1)
            return arr.length;

        int j=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];
        return j;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3,3,4,5,6,6,6,6,7,7,8,8};
        int no = dupNumber(arr);

        for (int i = 0; i < no; i++) {
            System.out.println(arr[i]);

        }

    }
}
