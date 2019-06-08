package com.example.myapplication;

public class Room {
    public final boolean isInfected;
    public boolean visited=false;
    Room(boolean infected){
        isInfected=infected;
    }
}
class Outbreak{
    public static boolean isOutbreak(Room[][] floor) {
        int result=0;
        for (int i=0;i<floor.length;i++){
            for (int j=0;j<floor[i].length;j++){
                int tmp=checkroom(0,floor,i,j);
                if (tmp>=result)result=tmp;
            }
        }
        System.out.println(result+" so");
        return result>=5;
    }
    public static int checkroom(int num,Room[][]floor,int y,int x){
        int result=num;

        if (y<0 || y>=floor.length) return 0;
        if (x<0 || x>=floor[0].length) return 0;

        if ((floor[y][x]).visited==true) return 0;
        if ((floor[y][x]).isInfected==false) return 0;

        floor[y][x].visited=true;

        result+=1;
        return result+checkroom(0,floor,y+1,x)+checkroom(0,floor,y-1,x)+checkroom(0,floor,y,x+1)+checkroom(0,floor,y,x-1);
    }
    public static void main(String[] args){
        Room[][] verticalTrue = new Room[][] {
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) },
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false) }
        };


        boolean b=isOutbreak(verticalTrue);
        System.out.println(b);

    }
}

