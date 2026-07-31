package Array;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {

        int[] arr = new int[]{9, -3, 3, -1, 6, -5};

        int k = 0;

        System.out.println(substring(arr, arr.length, k));

//        brute(arr, arr.length, k);


        System.out.println(Arrays.toString(arr));
    }

    public static int substring(int[] arr, int n, int k) {

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }

    public static void brute(int[] arr, int n, int k) {


        int sum = 0;
        int maxLen = 0;


        for (int i = 0; i < n; i++) {

            sum = 0;

            for (int j = i; j < n; j++) {

                sum += arr[j];

                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }


        System.out.print(maxLen);
    }


}
