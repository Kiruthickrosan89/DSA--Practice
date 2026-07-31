package Sort;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args){
        int[] a = new int[]{4,21,13,45,32,41,2};

        bubble(a);
    }

    public static void bubble(int[] arr){

        int n = arr.length;

        for(int i =0; i < n; i++ ){

            for(int j=0; j < n-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print(Arrays.toString(arr));

    }
}
