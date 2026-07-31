package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {

    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3,0, 12};

        int n = arr.length;

//        brute(arr, n);
        optimal(arr, n);
    }

    public static void brute(int[] arr, int n){

        List<Integer> newE = new ArrayList<>();

        for(int i =0; i < n; i++){
            if(arr[i] != 0){
                newE.add(arr[i]);
            }
        }

        int n2 = newE.size();

        for(int i =0; i < n2; i++){
            arr[i] = newE.get(i);
        }

        for(int i = n2; i < n; i++){
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void optimal(int[] arr, int n){

        int i =0;

        for(int j = 0; j < n; j++){
            if(arr[j] == 0){
                i = j;
                break;
                }
            }

        for(int j =+1; j < n; j++){

            if(arr[j] != 0){

                arr[i] = arr[j];
                arr[j] = 0;

                i++;
            }
        }

        System.out.print(Arrays.toString(arr));



    }

}
