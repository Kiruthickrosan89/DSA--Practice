package Sort;

import java.util.Arrays;

public class recursive_InsertionSort {
    public static void main(String[] args){
        int[] arr = new int[]{4,21,13,45,32,41,2};

        int n = arr.length;

        insertion(arr, 0,n);

        System.out.print(Arrays.toString(arr));
    }

    public static void insertion(int[] arr, int i, int n){

        if (i == n) return;

        int j = i;

        while(j > 0 &&  arr[j] < arr[j-1] ){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;

            j--;
        }

        insertion(arr,i+1,n );


    }
}
