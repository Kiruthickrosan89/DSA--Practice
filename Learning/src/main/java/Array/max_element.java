package Array;

import java.util.Arrays;

public class max_element {
    public static void main(String[] args){

        int[] arr = new int[]{2, 5, 1, 3, 0};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.print(max);
    }
}
