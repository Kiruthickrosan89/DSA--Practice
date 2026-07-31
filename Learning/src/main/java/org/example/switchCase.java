package org.example;

public class switchCase {

    public static void main(String[] args){

        int a = 10;
        int b = 20;

        switch (a+b){
            case 15:
                System.out.println(" sum is 15");
                break;

            case 20:
                System.out.println("sum is 20");
                break;

            case 30:
                System.out.println("sum is 30");
                break;

            default:
                System.out.println("No match found");


        }
    }
}
