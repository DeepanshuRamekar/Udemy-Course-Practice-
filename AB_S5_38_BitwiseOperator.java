package com.company;

public class AB_S5_38_BitwiseOperator {
    public static void main(String[] args) {
//        int x=0b1010;
//        int y=0b0110;
//        int z;
////        z=x&y;
////        z=x|y;
////        z=x^y;
//        System.out.println(z);

//        int x=-0b1010;
//        int y;
////        y=x<<2;
//        y=x>>>1;
//        System.out.println(String.format("%s",Integer.toBinaryString(x)));
//        System.out.println(String.format("%32s",Integer.toBinaryString(y)));

        int x=0b1010;
        int y;
        y=~x;
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
        System.out.println(y);
    }
}
