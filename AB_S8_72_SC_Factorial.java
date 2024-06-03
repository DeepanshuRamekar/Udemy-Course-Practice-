package com.company;

import java.util.Scanner;

public class AB_S8_72_SC_Factorial {
    public static void main(String[] args) {

//        QUES1:  Display a Multipication table :
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Table Number");
//        int M = sc.nextInt();
//        for (int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n",M,i,M*i);
//        }

//        QUES2:  Find the sum of 'n' Natural number:
//        System.out.println("Enter the 'n'th Natural Number");
//        int N = sc.nextInt();
//        int sum = 0;
//        for (int i=1;i<=N;i++){
//            sum +=i;
//        }
//        System.out.println("SUMMATION = "+sum);

//        QUES3:  Find Factorial of a Number :
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        long fact=1;
        for (int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of "+n+" = "+fact);
    }
}
