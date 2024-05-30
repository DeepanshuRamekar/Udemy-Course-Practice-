package com.company;

import java.util.Scanner;

public class AB_S1_8_ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // Float x = sc.nextFloat();
        // String x = sc.next();
        // String x = sc.nextLine();
        System.out.println("Enter 2 Numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(sc.hasNextInt());
        int z = x+y;
        System.out.println("X + Y = " +z);
        // System.out.println(x);
//        sc.useRadix(2);
//        int x = sc.nextInt();
//        System.out.println(x);


    }
}
