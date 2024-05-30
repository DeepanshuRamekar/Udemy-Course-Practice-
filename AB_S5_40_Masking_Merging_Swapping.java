package com.company;

public class AB_S5_40_Masking_Merging_Swapping {
    public static void main(String[] args) {
//        Swapping 2 Numbers:
//        int a=9,b=12;
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println(a +" " +b);

//        Masking Operation:
        byte a=9,b=12;
        byte c;
        c = (byte) (a<<4);
        c= (byte) (c|b);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));


    }
}
