package Recursion;

public class ex1 {

    public static void main(String[] args){
        f(1,3);
    }

    public static void f(int a, int n){
        if(a > n){
            return;
        }

       System.out.println(a+" Hello");
        f(a+1,n);
    }
}
