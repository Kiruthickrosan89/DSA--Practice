package Sort;

import java.util.Arrays;

public class Insertion_sort {

    public static void main(String[] args){
        int[] a = new int[]{4,21,13,45,32,41,2};

        Insertion(a);
    }

    private static void Insertion(int[] arr) {

        int n = arr.length;

        for(int i =1; i < n; i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && key < arr[j] ){

                arr[j+1] = arr[j];

                j--;

            }

            arr[j+1] = key;

        }

        System.out.print(Arrays.toString(arr));
    }
}
