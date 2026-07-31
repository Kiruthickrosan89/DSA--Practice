package Array;

public class MaximumConsecutive {
    public static  void main(String[] args){
        int[] arr = new int[]{1, 0, 0, 1, 0, 1, 1};
        optimal(arr, arr.length);
    }

    public static void optimal(int[] arr, int n){

        int count = 0;
        int element = arr[0];

        int MaxCount = 0;

        for(int i =1; i < n; i++){

            if( arr[i] == element){
                count++;
            }else{
                if(count > MaxCount){
                    MaxCount = count;
                }
                count =1;
                element = arr[i];
            }
        }


        System.out.print(MaxCount+ " -> " + element);
    }
}
