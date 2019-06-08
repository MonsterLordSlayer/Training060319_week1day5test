package com.example.myapplication;

public class Amstrong {
    boolean ams(int number){
        int temp=number;
        int result=0;
        while (temp>0){
            System.out.println(temp%10);
            result+=(temp%10)*(temp%10)*(temp%10);
            temp/=10;

        }
        System.out.println(result);
        if (result==number)return true;

        return false;
    }
    public static void main(String[] args){
        Amstrong a=new Amstrong();
        System.out.println(a.ams(153));
    }
}
