package Hash;

import java.util.HashMap;

public class Hashmap2 {
    public static void main(String[] args){

        String a = "qwertyuiiuytreq";
        int n = a.length();
        Hmap(a, n);
    }

    private static void Hmap(String a, int n) {
        HashMap<Character, Integer> Hmap = new HashMap<>();

       for (int i =0; i <  n; i++){
           int freq = 0;

           if(Hmap.containsKey(a.charAt(i))){
               freq = Hmap.get(a.charAt(i)) ;
           }

           freq++;

           Hmap.put(a.charAt(i), freq);
       }


       for(int i = 0; i < Hmap.size();i++){
           if(Hmap.containsKey(a.charAt(i))){
               System.out.println(a.charAt(i)+" -> "+Hmap.get(a.charAt(i)));
           }
       }
    }
}
