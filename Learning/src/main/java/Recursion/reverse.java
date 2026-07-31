package Recursion;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args){

        int[] a = new int[]{1,2,3,4,5};

//        L(a);


        System.out.println(Arrays.toString(R2(a,0, a.length-1)));
    }

    public static void L(int[] a){
        int l =0 ;
        int r = a.length -1 ;


        while(l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;
            r--;
        }

        System.out.println(Arrays.toString(a));
    }

    public static int[] R2(int[] a, int i, int n){

        if(i >= n/2 ){
            return a;
        }

        int temp = a[i];
        a[i] = a[n];
        a[n] = temp;

        R2(a, i+1, n-1);

        return a;
    }




}
