package Array;

public class FourSum {
        public static void main(String[] args){

            int[] arr = {-4,-1,-1,0,1,2};
            int target = 2;

            fourSum(arr, arr.length, target);

        }

        public static void fourSum(int[] arr, int n, int target){

            for(int i =0; i < n; i++){

                for(int j = i+1; j < n; j++){

                    int left = j+1;
                    int right = n-1;

                    while(left < right){

                        int sum = arr[i] +arr[j] + arr[left] + arr[right];

                        if(sum == target){
                            System.out.println(i+" "+ j+" "+ left+" "+ right);
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
        }
}
