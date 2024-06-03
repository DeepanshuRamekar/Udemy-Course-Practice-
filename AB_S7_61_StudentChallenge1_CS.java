package com.company;

import java.util.Scanner;

public class AB_S7_61_StudentChallenge1_CS {
    public static void main(String[] args) {
//        QUES 1: Find the number is even orr odd
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        if (n%2 == 0){
//            System.out.printf("The Number %d is a Even Number",n);
//        }
//        else {
//            System.out.printf("The Number %d is a Odd Number",n);
//        }

//        QUES 2: Find the Person is Young orr Not Young:
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the Age of a Person");
//        int n = sc.nextInt();
//        if (n>=14 && n<=55){
//            System.out.println("The Person is Young");
//        }
//        else {
//            System.out.println("The Person is Not Young");
//        }

//        QUES 3: Find the Person is Young orr Not Young:
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Marks of three Subjects M1, M2 & M3");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float Avg = (a+b+c)/3f;
        if (Avg >= 70){
            System.out.println("GRADE : 'A' ");
        }
        else if (Avg>=60 && Avg<=70 ) {
            System.out.println("GRADE : 'B' ");
        }
        else if (Avg>=50 && Avg<=60 ) {
            System.out.println("GRADE : 'C' ");
        }
        else if (Avg>=40 && Avg<=50 ) {
            System.out.println("GRADE : 'B' ");
        }
        else {
            System.out.println("GRADE : 'F' ");
        }
    }
}
