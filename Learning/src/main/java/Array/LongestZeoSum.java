package Array;

import java.util.HashMap;

public class LongestZeoSum {

    public static void main(String[] args){

        int[] arr = {9, -3, 3, -1, 6, -5};

        optimal(arr, arr.length);
    }

    public static void optimal(int[] arr, int n){

        HashMap< Integer, Integer> result = new HashMap<>();

        int sum =0;

        int MaxCount = 0;



        for(int i =0; i < n; i++){

            sum += arr[i];

            if (sum == 0) {

                MaxCount = i + 1;
            }

            if(result.containsKey(sum)){

                int startIndex = result.get(sum) ;

                int count = i - startIndex;

                if(count > MaxCount){

                    MaxCount = count;
                }


            }else{
                result.put(sum, i);
            }
        }

        System.out.println(MaxCount);
    }
}
