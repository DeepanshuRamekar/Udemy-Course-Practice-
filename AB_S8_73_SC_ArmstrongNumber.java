package com.company;

import java.util.Scanner;

public class AB_S8_73_SC_ArmstrongNumber {
    public static void main(String[] args) {

//        QUES1:  Display Digits of Number:
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int num = sc.nextInt();
//        int d ;
//        while(num > 0){
//            d = num %10;
//            num /= 10;
//            System.out.println("Digits of the number = "+d);
//        }

//        QUES2:  Counts The Digits of Number:
//        System.out.println("Enter the Number");
//        int num = sc.nextInt();
//        int count = 0 ;
//        while(num > 0){
//            num /= 10;
//            count++;
//        }
//        System.out.println("Count of the Digits of Number = "+count);

//        QUES4:  Finding a Number is Armstrong orr not :
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int sum = 0;
        int d;
        int num2=num;
        while (num>0){
            d = num%10;
            sum += (d*d*d);
            num /= 10;
        }
        if (sum == num2){
            System.out.printf("%d is a Armstrong Number",num2);
        }
        else {
            System.out.printf("%d is not a Armstrong Number",num2);
        }

    }
}
