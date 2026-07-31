package Array;

import java.util.Arrays;

public class rotateArray {

    public static void main(String[] args){

        int[] arr = new int[]{2, 4, 13, 21, 32, 41, 45};

        int n =arr.length;

//        brute(arr, n);

        optimal(arr,n);
    }

    public static void brute(int[] arr, int n){

        int[] result = new int[n];

        result[0] = arr[n-1];

        for(int i=0; i < n-1; i++){
            result[i+1] = arr[i];
        }

        System.out.println(Arrays.toString(result));
    }

    public static void optimal(int[] arr,int n){

        int lastElement = arr[n-1];

        for(int i=n-1; i > 0 ; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = lastElement;

        System.out.print(Arrays.toString(arr));
    }
}
