package Array;

import java.util.Map;
import java.util.TreeMap;

public class SubarrayWithSumZero {

    public static void main(String[] args){
        int[] arr = new int[]{9, -3, 3, -1, 6, -5};

        int k =0;


        optimal(arr, k, arr.length);

    }

    public static void optimal(int[] arr, int k, int n) {

        int sum = 0;
        int maxlen = 0;

        Map<Integer, Integer> seen = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum == 0) {
                maxlen = i + 1;
            } else if (seen.containsKey(sum)) {
                maxlen = Math.max(maxlen, i - seen.get(sum));
            } else {
                seen.put(sum, i);
            }
        }

        System.out.print(maxlen);
    }
}
