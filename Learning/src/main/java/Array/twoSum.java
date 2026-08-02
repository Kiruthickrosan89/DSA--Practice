
package Array;

public class twoSum {

    public static void main(String[] args){

        int[] arr = {-4,-1,-1,0,1,2};
        int target = 3;
        Twosum(arr, arr.length, target);

    }

    private static void Twosum(int[] arr, int n, int target) {

        int left = 0;
        int right = n-1;

        while(left < right){

            int sum = arr[left] + arr[right];

            if(target == sum){
                System.out.print(left+"  "+ right);
                break;
            }

            if(sum > target){
                right--;
            }else{
                left++;
            }

        }
    }
}
