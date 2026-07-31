package Hash;

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args){


        int str = 1234564123;

        int n = ( int )Math.log10(str)+1;

        hashmap(str, n);


    }

    public static void hashmap(int str, int n){


        HashMap<Integer, Integer> Hmap = new HashMap<>();



        for(int i =0; i <= n; i++){

            int digit = str%10;
            str = str/10;

            int freq = 0;

            if(str < 1){
                continue;
            }

            if(Hmap.containsKey(digit)){
                    freq = Hmap.get(digit);
            }

            freq++;

            Hmap.put(digit,freq);
        }

        for(int i =0; i < n; i++){
           if(Hmap.containsKey(i)){
               System.out.println(i+" -> "+ Hmap.get(i));
           }
        }
    }
}
