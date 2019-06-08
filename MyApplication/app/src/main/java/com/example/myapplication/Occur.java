package com.example.myapplication;

import java.util.HashMap;

public class Occur {
    public static HashMap<Integer,Integer> countoccur(int[] list){
        HashMap<Integer,Integer> result=new HashMap<>();
        for (int i:list){
            if (result.get(i)==null)result.put(i,1);
            else {

                result.put(i,result.get(i)+1);

            }

        }
        return result;
    }
    public static void main(String[] args){
        int[] values={1,2,2,154,2,1,2,111,11,111,3,4,4};
        HashMap<Integer,Integer> c=countoccur(values);
        for (Integer i:c.keySet()){
            System.out.println(i+"  occur "+c.get(i)+" times");
        }
    }
}
