package com.company;

public class AB_S2_14_Literals {
    public static void main(String[] args) {
//        byte b = 5;
//        short s = 15;
//        int i = 15;
//        System.out.println(b);

        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0XA;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        long l = 125;
        long l2 = 999_99999_9999L;
        System.out.println(l);
        System.out.println(l2);

        float f = 12.56f;
        double d = 12.56;
        System.out.println(f);
        System.out.println(d);
        String s  = "1101";
        int num = Integer.parseInt(s,2);
        System.out.println(num);

    }
}
