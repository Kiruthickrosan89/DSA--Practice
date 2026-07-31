package Array;

import java.util.*;

public class UnionOfTwoSortedArray {

    public static void main(String[] args){

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{2,3,4,4,5};

       optimal(arr1, arr2);
//        brute(arr1, arr2);
  //      better(arr1, arr2);
    }

    public static void optimal(int[] arr1, int[] arr2){

        int[] union = new int[10];

        int Left =0;
        int Right = 0;

        int index =0;

        while(Left < arr1.length || Right < arr2.length){

            if(Left > arr1.length -1 ){
                break;
            }

            if(Right > arr2.length -1 ){
                break;
            }

            if(arr1[Left] < arr2[Right] ){
                union[index] = arr1[Left];
                Left++;
                index++;
            }else{

                union[index] = arr2[Right];
                Right++;
                index ++;
            }
        }

        for(int i =Left; i < arr1.length; i++ ){
            union[index] = arr1[i];
            index++;
        }


        for(int i =Right; i < arr2.length; i++ ){
            union[index] = arr2[i];
            index++;
        }



        System.out.println(Arrays.toString(union));
    }

    public static void brute(int[] arr1, int[] arr2){

        Map<Integer, Integer> dict = new TreeMap<>();

        for(int num : arr1){
            dict.put(num, dict.getOrDefault(num, 0)+1);
        }

        for(int num : arr2){
            dict.put(num, dict.getOrDefault(num, 0)+1);
        }

        List<Integer> result = new ArrayList<>();

        for(int val : dict.keySet()){
            result.add(val);
        }

        System.out.print(result);

    }

    public static void better(int[] arr1,int[] arr2){

        TreeSet<Integer> result = new TreeSet<>();

        for(int val :arr1){
            result.add(val);
        }

        for(int val : arr2 ){
            result.add(val);
        }


        Object[] res = result.toArray(new Integer[0]);


        System.out.print(Arrays.toString(res));
    }
}
