package com.company;

import java.util.Scanner;

public class AB_S5_31_CalculateArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you have Base & height of triangle Press 1 ");
        System.out.println("If you have sides of triangle Press 0 ");
        int i = sc.nextInt();
        if(i == 1){
            System.out.println("Enter the Base of triangle in cm");
            float b = sc.nextFloat();
            System.out.println("Enter the Height of triangle in cm");
            float h = sc.nextFloat();
            System.out.print("Area of triangle = ");
            float Area = 0.5f * b * h;
            System.out.print(Area +" cm2");
        }
        else {
            System.out.println("Enter the 3 sides of Triangle in cm");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            float s = 0.5f * (a+b+c);
            double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of Traingle = " +Area +" cm2");
        }


    }
}
