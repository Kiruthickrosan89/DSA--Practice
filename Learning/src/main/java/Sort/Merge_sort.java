package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_sort {

    public static void main(String[] args){

        int[] arr = new int[]{56,43,23,1,7,45,12,34};
        merge_sort(arr, 0, arr.length-1);
    }

    private static void merge_sort(int[] arr, int low, int high) {

        if (low >= high){
            return;
        }

        int mid = (low + high) / 2;

        merge_sort(arr, low, mid);

        merge_sort(arr, mid+1, high);

        merge(arr, low, mid, high);




    }

    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> List = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                List.add(arr[left++]);
            }else{
                List.add(arr[right++]);
            }
        }

        while(left <= mid){
            List.add(arr[left++]);
        }

        while(right <= high){
            List.add(arr[right++]);
        }

        for(int i =low; i <= high; i++){
            arr[i] = List.get(i - low);
        }

        System.out.println(Arrays.toString(arr));
    }
}
