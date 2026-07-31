package Hash;

import java.util.HashMap;
import java.util.Map;

public class Max_Min {
    public static void main(String[] args){
        int a = 309876543;

        int n = (int )Math.log10(a)+1;

        FindMinMax(a,n);
    }

    private static void FindMinMax(int a, int n) {

        HashMap<Integer, Integer> Hmap = new HashMap<>();


        for (int i = 1; i <= n; i++) {

            int digit = a % 10;
            a = a / 10;

            int freq = 0;


            if (Hmap.containsKey(digit)) {
                freq = Hmap.get(digit);
            }

            freq++;

            Hmap.put(digit, freq);
        }

        int max = 0;
        int min = 0;

        int max_freq = 0;
        int min_freq = n;


        for (HashMap.Entry<Integer, Integer> Entry : Hmap.entrySet()) {

            int i = Entry.getKey();
            if(Hmap.containsKey(i)){
                int curr_freq = Hmap.get(i);

                if (curr_freq > max_freq) {
                    max = i;
                    max_freq = curr_freq;
                }

                if (curr_freq < min_freq) {
                    min = i;
                    min_freq = curr_freq;
                }

                System.out.println(i +" -> "+ curr_freq);
            }

        }

        System.out.println("Max key =" + max);
        System.out.println("Maximum Frequency ="+ max_freq);

        System.out.println("Min key ="+min);
        System.out.println("Min frequency ="+ min_freq);


    }
}
