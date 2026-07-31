package Array;

import java.util.Arrays;

public class nextPermutation {

    public static void main(String[] args){

        int[] arr = {1,2,3};

        next_permutation(arr, arr.length);
    }

    private static void next_permutation(int[] arr, int n) {

        int index = -1;

        for(int i =n-2; i > 0; i--){

           if (arr[i] < arr[i+1]){
               index = i;
               break;
            }

        }

        if(index == -1){
            reverse(arr, n, 0, n-1);
        }


        int val = 0;

        for(int i = n-1; i > 0; i--){
            if( arr[i] > arr[index]){
               swap(arr, i, index);
               break;
            }
        }

        reverse(arr,n, index+1, n-1);

        System.out.print(Arrays.toString(arr));

    }

    public static void reverse( int[] arr, int n,  int left,int right){


        while(left > right){

            swap(arr, left, right);

            left++;
            right--;
        }
    }

    public static  void swap( int[] arr, int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
