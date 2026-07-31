package Logics;

public class BasicMaths {
    public static void main(String[] args){
        int a = 11;
        int b = 13;
        System.out.println(findGcd(a, b));
    }

    private static int findGcd(int a, int b) {
        while(a != 0 && b !=0){
            if(a > b){
                a = a%b;
            }

            else{
                b = b%a;
            }

            if(a == 0 ){
                return b;
            }
        }

        return a;
    }
}
