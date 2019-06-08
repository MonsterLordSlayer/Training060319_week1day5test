package com.example.myapplication;

public class Singleton {

    private Singleton(){};
    public String s="Monster Lord Slayer";
    private static Singleton Instance;
    public synchronized static Singleton getInstance(){
        if (Instance==null){
            Instance=new Singleton();

        }
        return Instance;
    }

}
class Main
{
    public static void main(String args[])
    {

        Singleton x = Singleton.getInstance();


        Singleton y = Singleton.getInstance();


        Singleton z = Singleton.getInstance();

        // changing variable of instance x
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
        x.s = "Angel Killer";

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");


    }
}
