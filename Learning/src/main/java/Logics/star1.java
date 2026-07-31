package Logics;

public class star1 {
    public  static void main(String[] args){
        int n = 5;
        star(n);
    }

    public static void star(int n){
        for(int i= 0; i < n; i++ ){
            for(int j = 1; j<=n - i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
