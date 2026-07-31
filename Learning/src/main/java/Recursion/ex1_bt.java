package Recursion;

public class ex1_bt {
    public static void main(String[] args){
//        R(3);
        R2(1,3);
    }

    public static void R( int n){
        if(n < 1){
            return;
        }

        R( n-1);

        System.out.println(n);

    }

    public static void R2(int a, int n){
        if(a > n){
            return;
        }

        R2(a+1, n);

        System.out.println(a);
    }
}
