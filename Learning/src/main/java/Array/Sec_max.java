package Array;

import java.util.Arrays;

public class Sec_max {
    public static void main(String[] args){
        int[] arr = new int[]{4,21,13,45,32,41,2};

        int n = arr.length;

//        Brute(arr, n);
//        optimal(arr,n);
        Best(arr, n);

        System.out.print(Arrays.toString(arr));
    }

    private static void Brute(int[] arr, int n) {
        for(int i = 0; i<n;i++){
            int key = i;

            for(int j=i+1; j<n;j++){
                if(arr[key] > arr[j]){
                   key = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[key];
            arr[key] = temp;
        }
    }

    private static void optimal(int[] arr, int n){
        for(int i=0; i < n-1; i++){

            if(arr[i] > arr[i+1]){

                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }


        }

        int max = arr[n-1];

        int secMax = Integer.MIN_VALUE;

        for(int j=0; j < n; j++){

            if( arr[j] > secMax && arr[j] != max){
                secMax = arr[j];
            }
        }

        System.out.println(secMax);
    }

    public static void Best(int[] arr, int n){

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i =0; i < n; i++){

            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }

        System.out.println(secMax);
    }
}
