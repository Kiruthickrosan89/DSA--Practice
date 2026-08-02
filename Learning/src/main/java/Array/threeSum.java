package Array;

public class threeSum {

    public static void main(String[] args){

        int[] arr = {-4,-1,-1,0,1,2};
        int target = 3;

        ThreeSum(arr, arr.length, target);

    }

    public static void ThreeSum(int[] arr, int n, int target ){




        for(int i =0; i < n; i++){

                int left = i+1;
                int right = n-1;

                while(left < right){

                    int sum = arr[i] + arr[left] + arr[right];

                    if(sum == target){

                        System.out.println(i +" "+left+" "+right);
                        break;
                    }

                    if( sum > target){

                        right--;
                    }else{

                        left++;
                    }

                }


        }
    }
}
