package Array;

import java.util.HashMap;

public class countSubarraySum {

    public static void main(String[] args){

        int[] arr = {3, 1, 2, 4};
//        brute(arr, arr.length, 3);
        System.out.println(optimal(arr, arr.length, 3));
    }

    public static void brute(int[] arr, int n, int k){


        int count = 0;

        for(int i =0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;

                for(int m = i; m <= j ; m++ ){
                    sum +=arr[m];
                }

                if(sum == k){
                    count++;
                }

            }
        }

        System.out.println(count);
    }

    public static int optimal(int[] arr, int n, int k){

        HashMap<Integer, Integer> Prefixsum = new HashMap<>();

        int count = 0;
        int sum =0;

        Prefixsum.put(0, 1);

        for(int i =0; i < n; i++){

            sum += arr[i];

            int remove = sum - k;

            if(Prefixsum.containsKey(remove)){
                count += Prefixsum.get(remove);
            }

            Prefixsum.put(sum, Prefixsum.getOrDefault(sum, 0)+1);
        }

        return count;
    }
}
