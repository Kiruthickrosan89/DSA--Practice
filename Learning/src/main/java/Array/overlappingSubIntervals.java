package Array;

import java.util.Arrays;

public class overlappingSubIntervals {

    public static void main(String[] args){

        int[][] matrix = { {1, 3}, {2, 6}, {8, 10}, {15, 18} };
        brute(matrix);
    }

    public static void brute(int[][] matrix){

        for(int i=0; i < matrix.length - 1; i++){

            if(matrix[i][1] > matrix[i+1][0]){
                int[] res ={ Math.min(matrix[i][0], matrix[i+1][0]), Math.max(matrix[i][1], matrix[i+1][1])};

                System.out.println(Arrays.toString(res));
            }
        }

        System.out.println(matrix.length);
    }
}
