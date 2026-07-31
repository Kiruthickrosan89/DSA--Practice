package Recursion;

public class sum {

    public static void main(String[] args){

        int total = 0;
        System.out.println(sum2(5));
    }

    public static int sum(int n, int total){
        if(n < 1){
            return total + n;
        }

       total = sum(n-1, total);

        System.out.println("passed");

        return total + n;

    }


    public static int sum2(int n){
        if(n < 0){
            return 0;
        }

        return n + sum2(n-1);
    }
}
