package Array;

public class SetMatrixZero {

    public static void main(String[] args){

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        brute(matrix);
        optimal(matrix);
    }

    public static void brute(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i =0; i < m; i++){

            for(int j=0; j < n; j++){

                if(matrix[i][j] == 0){

                    for(int index = 0; index < matrix.length; index++){
                        matrix[index][j] = -1;
                        matrix[i][index] = -1;
                    }
                }
            }
        }

        for(int i =0; i < m; i++){

            for(int j=0; j < n; j++){

                if(matrix[i][j]  == -1){
                    matrix[i][j] = 0;
                }
            }

        }

        for(int i =0; i < m; i++){

            for(int j=0; j < n; j++){

               System.out.print(matrix[i][j]);
            }

            System.out.println(" ");
        }


    }

    public static void optimal(int[][] matrix){

        boolean rowZero = false;
        boolean columnZero = false;

        for(int index = 0; index <matrix.length; index++){
            if(matrix[index][0] == 0){
                rowZero = true;
                break;
            }
        }

        for(int index =0; index < matrix[0].length; index++){
            if(matrix[0][index] == 0){
                columnZero = true;
                break;
            }
        }

        for(int i =1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){

                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i =1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){

                if( matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(rowZero){
            for(int i =0; i < matrix.length;i++){
                matrix[i][0] =0;
            }
        }

        if(columnZero){
            for(int i =0; i < matrix[0].length;i++){
                matrix[0][i] =0;
            }
        }

        for(int i =0; i < matrix.length; i++){

            for(int j=0; j < matrix[0].length; j++){

                System.out.print(matrix[i][j]);
            }

            System.out.println(" ");
        }

    }

    public static void columnZero(int n, int[][] matrix){

       for(int i = 0; i < matrix.length; i++){
          if( matrix[i][n] == -1){
             rowZero(i, matrix);
          }

           matrix[i][n] = 0;
       }
    }

    public static void rowZero(int n, int[][] matrix){

        for(int i =0; i < matrix[0].length;i++){

            if(matrix[n][i] == -1 ){
                columnZero(i,matrix);
            }
            matrix[n][i] = 0;
        }
    }
}
