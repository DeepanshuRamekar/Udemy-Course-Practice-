package com.company;

import java.util.Scanner;

public class AB_S8_74_SC_Loop_Fibonacci {
    public static void main(String[] args) {

//        QUES1:  Display AP Series:
        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the First Term of AP series");
//        int a = sc.nextInt();
//        System.out.println("Enter the Common Difference of AP series");
//        int d = sc.nextInt();
//        System.out.println("Enter how Many Term You Want");
//        int n = sc.nextInt();
//        int term = a;
//        for (int i=1;i<=n;i++){
//            System.out.print(term+" ");
//            term += d;
//        }

//        QUES2:  Display GP Series:
//        System.out.println("Enter the First Term of GP series");
//        int a = sc.nextInt();
//        System.out.println("Enter the Common Ratio of GP series");
//        int r = sc.nextInt();
//        System.out.println("Enter how Many Term You Want");
//        int n = sc.nextInt();
//        int term = a;
//        for (int i=1;i<=n;i++){
//            System.out.print(term+" ");
//            term *= r;
//        }

//        QUES3:  Display Fibonacci Series:
        System.out.println("Enter how many Terms of Fibonacci Series Do you want");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=1;i<=n-2;i++){
            c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
