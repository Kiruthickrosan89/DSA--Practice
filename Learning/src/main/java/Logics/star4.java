package Logics;

public class star4 {

    public static void main(String[] args){

        int n = 5;
        star4(n);
    }
    public static void star(int n){
        for(int i =1; i<= n*2-1; i++){


            // if the question has both up and down pattern then use this star variable
            int stars;

            if (i <= n)
                stars = i;
            else
                stars = 2 * n - i;

            for(int j=0; j < stars; j++){
                System.out.print("*");
            }

            for(int j= 0 ; j <n- stars; j++ ){
                System.out.print(" ");
            }
            for(int j=0; j < n-stars; j++ ){
                System.out.print(" ");
            }

            for(int j=0; j<stars;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void star2(int n){


        // if the pattern is going downward to upward then write two for loops
        for(int i = n;i > 0;i-- ){

            for(int j =0; j < i;j++){
                System.out.print("*");
            }

            for(int j =0;j < n-i; j++){
                System.out.print(" ");
            }

            for(int j =0;j < n-i; j++){
                System.out.print(" ");
            }

            for(int j =0; j < i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 1;i <=n;i++ ){

            for(int j =0; j < i;j++){
                System.out.print("*");
            }

            for(int j =0;j < n-i; j++){
                System.out.print(" ");
            }

            for(int j =0;j < n-i; j++){
                System.out.print(" ");
            }

            for(int j =0; j < i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static  void star3(int n){
        for(int i =0;i< n; i++){
            for(int j=0; j< n;j++){
                if( i ==0 ||j ==0 || i == n-1|| j ==n-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void star4(int n){
        for(int i =0;i <= 2*n-2; i++){
            for(int j=0;j <= 2*n-2; j++ ){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int bottom = (2*n - 2) - i;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left,right)));
            }
            System.out.println();
        }
    }
}
