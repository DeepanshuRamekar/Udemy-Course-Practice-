package com.company;

import java.util.Scanner;

public class AB_S5_32_QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b & c for the Equation ax2 + bx + c =0");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int SQRT = b * b - 4 * a * c;
        if (SQRT < 0){
            System.out.println("The Roots are Imaginary");
        }
        else {
            double r1 = (-b + Math.sqrt(SQRT))/(2*a);
            double r2 = (-b - Math.sqrt(SQRT))/(2*a);
            System.out.println("Root 1 = " +r1);
            System.out.println("Root 2 = " +r2);
        }

    }
}
