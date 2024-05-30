package com.company;

public class AB_S5_41_Widening_Norrowing {
    public static void main(String[] args) {
        byte b= 5;
        short s=10;
        int i=10;
        long l=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bl=true;
//        Widening:
//        s=b;
//        i=b;
//        l=b;
//        f=b;

//        Narrowing:
        b= (byte) s;
        System.out.println(b);
        i= (int) f;
        System.out.println(i);

    }
}
