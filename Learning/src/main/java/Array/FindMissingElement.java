package Array;


import java.util.Arrays;

public class FindMissingElement {

    public static  void main(String[] args){
        int[] arr = new int[]{8, 2, 4, 5, 3, 7, 1};

        int n = arr.length+1;

//        Find(arr, n);

        System.out.print(optimal(arr, n));
    }

    private static void Find(int[] arr, int n) {

        sort(arr, n);

        for(int i =0; i < n-1; i++){
            int sum = arr[i+1] - arr[i];

            if(sum > 1){

                int value = arr[i] +1;
                System.out.println("Missing Element"+ value);
            }
        }
    }

    public static void sort(int[] arr, int n){



        for(int i =1; i < n; i++){

            int key = arr[i];
            int j = i-1;

            while( j >= 0 && key < arr[j] ){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

        }


        System.out.println(Arrays.toString(arr));
    }


    public static int optimal(int[] arr, int n){


        int sum = 0;
        for(int i =0; i < n-1; i++){
            sum += arr[i];
        }

        int expected = n * (n + 1)/ 2;


        return expected - sum;


    }

}
