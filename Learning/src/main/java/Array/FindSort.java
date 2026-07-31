package Array;

public class FindSort {
    public static  void main(String[] args){
        int[] arr = new int[]{2, 4, 13, 21, 32, 41, 45};

        int n = arr.length;

        isSort(arr, n);
    }

    public static void isSort(int[] arr, int n){



        for(int i =0; i < n-1; i++){
            if(arr[i] > arr[i+1]){


                System.out.print("This array is not sorted");
                return;
            }
        }

        System.out.print(" this array is sorted");
    }
}
