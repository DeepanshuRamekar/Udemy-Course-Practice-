package com.company;

public class AB_S8_71_ForLoops {
    public static void main(String[] args) {

//        Incrementing For Loop:
        for (int i=0;i<10;i++){
            System.out.println(i);
        }

//        Decrementing For Loop:
        for (int i=10;i>0;i--){
            System.out.println(i);
        }

//        Infinite For Loop:
//        int i=0;
//        for (;;){
//            System.out.println(i);
//            i++;
//        }

//        We can declare Muiltiple Variables in For Loop:
        for (int a=0,j=1;a<10;a++,j=j*2){
            System.out.println(a+" "+j);
        }
    }
}
