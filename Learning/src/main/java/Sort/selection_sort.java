package Sort;

import java.util.Arrays;

public class selection_sort {

    public static void main(String[] args){
        int[] a = new int[]{4,21,13,45,32,41,2};

        Selection(a);
    }

    public static void Selection(int[] arr){
        int n = arr.length;

        for(int i=0; i< n - 1; i++){

            int minIndex = i;

            for(int j = i+1; j < n; j++){


                if(arr[minIndex]> arr[j] ){
                    minIndex = j;
                }


            }

            int temp = arr[i] ;
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        System.out.print(Arrays.toString(arr));
    }
}
