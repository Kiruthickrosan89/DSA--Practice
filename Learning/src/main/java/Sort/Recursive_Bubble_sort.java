package Sort;

import java.util.Arrays;

public class Recursive_Bubble_sort {
    public static void main(String[] args){

        int[] arr = new int[]{56,43,23,1,7,45,12,34};

        int n = arr.length;

        Bubble(arr, n);

        System.out.print(Arrays.toString(arr));
    }

    private static void Bubble(int[] arr, int n) {

        boolean didswap = false;

        for(int i =0; i <= n-2; i++){

            if(arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;

                didswap = true;

            }

        }

        if(didswap){
           return;
        }


        Bubble(arr, n-1);
    }
}
