package Logics;

public class star3 {
    public static void main(String[] args){
        int n =5;
        star5(n);
    }

    public static void star(int n){
        char[] a = new char[]{'A','B','C','D','E'};
        for(int i = 0;i <= n;i++){
            for(int j =0; j< i;j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }

    public static void star2(int n){
        char[] a = new char[]{'A','B','C','D','E'};
        for(int i = n;i >= 0;i--){
            for(int j =0; j< i;j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }

    public static void star3(int n){
        char[] a = new char[]{'A','B','C','D','E'};
        for(int i = 0;i < n;i++){
            for(int j =0; j< i+1;j++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }

    public static void star4(int n) {

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';

            // Characters
            for (int j = 0; j < 2 * i + 1; j++) {

                System.out.print(ch);

                if (j < i)
                    ch++;
                else
                    ch--;
            }

            System.out.println();
        }
    }

    public static void star5(int n){
        for(int i=1; i<= n; i++){
            char ch = (char)('A'+(n - i));

            for(int j = 0; j < i;j++){
                System.out.print(ch++);
            }

            System.out.println();
        }
    }


}
