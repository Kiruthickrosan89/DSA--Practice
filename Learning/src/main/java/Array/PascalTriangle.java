package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args){

        int n = 5;

        int c = 5, r =3;

        drawPascal(n);
        findPascal(c,r);
    }

    private static void findPascal(int c, int r) {

        c = c-1;
        r = r-1;

        int result = 1;
        for(int i =0; i < r; i++){

            result *= (c-i);
            result /= (i+1);
        }

        System.out.println(result);
    }

    private static void drawPascal(int n) {

        List<List<Integer>> pascal = new ArrayList<>();

        for(int i =0; i < n; i++){

            List<Integer> row = new ArrayList<>();
            for(int j =0; j <= i; j++){

                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    List<Integer> previousRow = pascal.get(i-1);

                    row.add(previousRow.get(j) + previousRow.get(j-1));


                }
            }

            pascal.add(row);
        }

        for( List<Integer> arr : pascal ){
            System.out.println(arr);
        }
    }
}
