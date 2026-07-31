package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrageArrayElements {

    public static  void main(String[] args){

        int[] arr = {1, 2, -4, -5};

//        brute(arr, arr.length);
        optimal(arr, arr.length);
    }

    public static void brute(int[] arr, int n){

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i =0; i < n; i++){

            if(arr[i] > 0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }

        int index =0;
        int i =0;
        while(index < n){

            if(!pos.isEmpty()){
                arr[index] = pos.get(i);
                index++;
            }

            if(!neg.isEmpty()){
                arr[index] = neg.get(i);
                index++;
            }

            i++;
        }

        System.out.print(Arrays.toString(arr));
    }

    public static void optimal(int[] arr, int n){

        int[] res = new int[n];

        int posIndex = 0, negIndex = 1;

        for(int i =0; i < n; i++){
            if(arr[i] > 0){
                res[posIndex] = arr[i];
                posIndex += 2;
            }else{
                res[negIndex] = arr[i];
                negIndex += 2;
            }
        }

        System.out.println(Arrays.toString(res));
    }
}
