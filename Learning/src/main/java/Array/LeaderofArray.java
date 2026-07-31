package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderofArray {
    public static void main(String[] args ){

        int[] arr = {4,7,1,0};
//        brute(arr, arr.length);

        optimal(arr, arr.length);
    }

    public static void brute(int[] arr, int n){

        int index =1;

        int[] greatest = new int[5];



        for(int i = n-2; i > 0; i-- ){

            for(int j = i+1; j < n; j++ ){

                if(arr[i] > arr[j]){
                    greatest[index] = arr[i];
                    index++;
                    break;
                }else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(greatest));
    }

    public static void optimal(int[] arr, int n ){

        List<Integer> result = new ArrayList<>();
        int greatest = arr[n-1];

        result.add(greatest);

        for(int i = n-1;i >= 0; i--){

            if(arr[i] > greatest){

                greatest= arr[i];
                result.add(greatest);

            }

        }

        System.out.print(result);
    }
}
