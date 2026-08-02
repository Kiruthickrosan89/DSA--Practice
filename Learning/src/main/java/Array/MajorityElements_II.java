package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElements_II {

    public static void main(String[] args){

        int[] arr = {1, 2, 1, 1, 3, 2};
        myOptimal(arr, arr.length);
    }

    private static void myOptimal(int[] arr, int n) {

        HashMap<Integer, Integer> seen = new HashMap<>(n);

        for (int num : arr) {
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for(int val : seen.keySet()){

            if(seen.get(val) > n/3){
                result.add(val);
            }
        }

        for(int val : seen.keySet()){

            System.out.println(val);
        }


        System.out.print(result);
    }

}
