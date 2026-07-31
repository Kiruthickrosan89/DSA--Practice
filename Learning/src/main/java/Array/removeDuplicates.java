package Array;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {

        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;



        optimal(arr, n);

    }

    public static void Brute(int[] arr, int n){

        HashSet<Integer> seen = new HashSet<>();

        int index = 0;

        for(int ar : arr){

            if(!seen.contains(ar)){
                seen.add(ar);

                arr[index] = ar;

                index++;

            }
        }

        int n2 = seen.size();

        int[] sliced = Arrays.copyOfRange(arr, 0, n2);

        System.out.println("Sliced :"+Arrays.toString(sliced));

        System.out.print(Arrays.toString(arr));

    }



    public static void optimal(int[] arr, int n){

        int i =0;

        for(int j =i+1; j < n; j++ ){

            if(arr[i] != arr[j]){

                arr[++i] = arr[j];
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}
