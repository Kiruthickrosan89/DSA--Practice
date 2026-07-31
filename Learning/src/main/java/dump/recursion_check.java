package dump;

public class recursion_check {

    public static  void main(String[] args){

        int n =10;
        int sum = 1;
        System.out.print(sum(n, sum));
    }

    public static int sum(int n, int sum){


        if(n == 1){
            return sum*n;
        }

        sum = sum(n-1, sum);

        return sum*n;
    }
}
