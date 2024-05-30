package com.company;

import java.util.Scanner;

public class AB_S5_33_Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length, breadth & Height respectively in cm");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.print("Total Surface Area of Cuboid = ");
        System.out.println(2*(l*b + b*h + l*h) +" sq.cm");
        System.out.println("Volume of Cuboid = " +(l*b*h) +" cubic cm");
        System.out.println("Perimeter of Cuboid = " +(4*(l+b+h)) +" cms");
    }
}
