package Array;

import Hash.Hashmap;

import java.util.HashMap;

public class CountSubArrayXor {
    public static void main(String[] args){

        int[] arr = {4, 2, 2, 6, 4};
        int target = 6;

//        brute(arr, target, arr.length);

        optimal(arr, target, arr.length);
    }

    public static void brute(int[] arr, int target, int n){

        int count = 0;

        for(int i =0; i < n; i++){

            int Xor = 0;

            for(int j = i; j < n; j++){

                Xor ^= arr[j];

                if( Xor == target){
                    count++;
                }
            }
        }

        System.out.println(count);
    }


    public static void optimal(int[] arr, int target, int n){

        HashMap<Integer, Integer> res = new HashMap<>();

        int index = 0;
        int Xor = 0;
        int count = 0;

        res.put(0,1);

        while(index < n){

            Xor ^= arr[index];

            int val = target ^ Xor;

            if(res.containsKey(val)){
                count += res.get(val);
            }

            res.put(Xor, res.getOrDefault(Xor,0)+1);

            index++;
        }

        System.out.print(count);
    }
}