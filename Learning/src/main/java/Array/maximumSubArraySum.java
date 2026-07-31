package Array;

public class maximumSubArraySum {

    public static void main(String[] args){

        int[] arr = {2, 3, 5, -2, 7, -4};

        kandane(arr, arr.length);
    }

    private static void kandane(int[] arr, int n) {

        int curr =0;
        int start = 0;

        int maxSum = 0;
        int maxIndex = 0;
        int tempStart = 0;

        for(int i=0; i < n; i++){

            curr += arr[i];

            if( curr > maxSum){
                maxSum = curr;
                maxIndex = i;
                start = tempStart;
            }

            if(curr < 0){
                curr = 0;
                tempStart = i+1;
            }
        }

        System.out.println(start +","+maxIndex);
        System.out.print(maxSum);

    }
}
