package Hash;

public class Hash1 {

    public static void main(String[] args){
        int str = 123456543;

        int n = (int) (Math.log10(str)+1);

        System.out.println(n);

        hash_Function(str, n);
    }

    private static void hash_Function(int str, int n) {

        int[] hash = new int[10];

        for(int i = n; i >=  1; i-- ){


            int digit = str%10;

            hash[digit] += 1;

            str = str/10;
        }


        for(int i =0; i < hash.length; i++ ){
            System.out.println(i+" ->"+hash[i]);
        }



    }
}
