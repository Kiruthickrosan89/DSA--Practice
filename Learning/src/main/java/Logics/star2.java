package Logics;

public class star2 {

    public static void main(String[] args){

        int n = 5;
        star5(n);
    }

    public static void star(int n){
        for(int j = 0; j< n; j++){
            for(int i=0; i < n -j; i++){
                System.out.print(" ");
            }

            for(int i = 0; i < j*2+1;i++){
                System.out.print("*");
            }

            for(int i=0; i < n -j; i++){
                System.out.print(" ");
            }

            System.out.println();
        }
        for(int j = n; j >= 0; j--){
            for(int i=0; i < n -j; i++){
                System.out.print(" ");
            }

            for(int i = 0; i < j*2+1;i++){
                System.out.print("*");
            }

            for(int i=0; i < n -j; i++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void star2(int n){
        for(int j = n; j >= 0; j--){
            for(int i=0; i < n -j; i++){
                System.out.print(" ");
            }

            for(int i = 0; i < j*2+1;i++){
                System.out.print("*");
            }

            for(int i=0; i < n -j; i++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }


    public static  void star3(int n){
        for(int i = 1; i <= n*2;i++){

            int stars = i;

            if(stars > n){
                stars = n*2 - stars+1;
            }

           for(int j =1; j <= stars;j++){
               System.out.print("*");
           }

           System.out.println();
        }
    }

    public static void star4(int n){
        for(int i = 1; i<= n; i++){

            int start;

            if(i%2==0){
                start = 0;
            }else{
                start = 1;
            }

            for(int j = 0; j < i;j++){
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
    }

    public static void star5(int n){
        for(int i =1; i <= n;i++){
            for(int j=1; j<= i;j++){
                System.out.print(j);
            }
            for(int j =0;j < n-i;j++){
                System.out.print(" ");
            }
            for(int j =0;j < n-i;j++){
                System.out.print(" ");
            }
            for(int j=i; j> 0;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void star6(int n){
        int value =1;
        for(int i =0; i< n; i++){


            for(int j =0; j< i; j++){
                System.out.print(value);
                value++;
            }

            System.out.println();
        }
    }
}