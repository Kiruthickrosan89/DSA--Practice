package Array;

public class MaxProfit {

    public static void main(String[] args){

        int[] arr = {7, 1, 5, 3, 6, 4};

        optimal(arr, arr.length);
    }

    public static void optimal(int[] arr, int n){

        int MinElement = arr[0];
        int MaxPrice = 0;

        for(int Element : arr){

            if( Element < MinElement ){
                MinElement = Element;
            }else{
                MaxPrice = Math.max(MaxPrice, Element - MinElement);
            }


        }

        System.out.print(MaxPrice);
    }
}
