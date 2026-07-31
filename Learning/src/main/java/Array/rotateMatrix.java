package Array;

import java.util.Arrays;

public class rotateMatrix {

    public static void main(String[] args){

        int[][] matrix =  {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        brute(matrix,matrix.length);
        optimal(matrix, matrix.length);
    }

    public static void brute(int[][] matrix, int n){

        int[][] result = new int[n][n];

        for(int i =0; i < n; i++){
            for(int j =0; j < n; j++){

                result[j][n - i -1] = matrix[i][j];

            }
        }

        for(int[] row: result){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void optimal(int[][] matrix, int n){

        for(int i =0; i < n; i++){

            for(int j= i +1; j < n; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int[] row: matrix){

            int left =0, right = n-1;

            while(left < right){
               int temp = row[left];
               row[left] = row[right];
               row[right] = temp;

               left++;
               right--;

            }
        }

        for(int[] arr: matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
}
