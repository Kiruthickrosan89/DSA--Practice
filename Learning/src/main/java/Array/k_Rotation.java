package Array;

import java.util.Arrays;

public class k_Rotation {
    public static void main(String[] args){
        int[] arr = new int[]{2, 4, 13, 21, 32, 41, 45};

        int k = 2;
        int n = arr.length;
        String rotation = "right";

//        brute(arr, k,n, rotation);
        optimal(arr, k, n , rotation);

    }

    public static void brute(int[] arr, int k, int n, String rotation){

        int[] temp = new int[k];

        for(int i = 0; i < k;i++){
            if(rotation == "right"){
                temp[i] = arr[i];
            }else{
                temp[i] = arr[n-1-i];
            }
        }

        System.out.println(Arrays.toString(temp));

      for(int i =0; i < k; i++){
          if(rotation == "Left"){
              for(int j = n-1; j > 0; j--){
                  arr[j] = arr[j -1];
              }
          }else{
              for(int q = 0; q < n-1; q++){
                  arr[q] = arr[q +1];
              }
          }
      }

       for(int i = 0; i < k; i++){
           if(rotation == "Left"){
               arr[i] = temp[i];
           }else{
               arr[n-1-i] = temp[i];
           }
       }

       System.out.print(Arrays.toString(arr));
    }

    public static void optimal(int[] arr, int k, int n, String rotation){

       if( rotation == "Left"){
           reverse(arr, 0, n-1);

           reverse(arr, 0,k-1);

           reverse(arr, k,n-1);

           System.out.println(Arrays.toString(arr));

       }else{

           reverse(arr, 0, k-1);

           reverse(arr, k, n-1);

           reverse(arr, 0, n-1);

           System.out.println(Arrays.toString(arr));
       }
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp =  arr[start] ;
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


}
