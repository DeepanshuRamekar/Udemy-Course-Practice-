package com.company;

import java.util.Scanner;

public class AB_S7_62_StudentChallenge2_CS {
    public static void main(String[] args) {

//        Ques 1: Find out the Redix of a Number Given in a String
        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the number");
//        String str = sc.next();
//        if (str.matches("[01]+")){
//            System.out.println("The Number is Binary Number and the Redix is 2");
//        }
//        else if (str.matches("[0-7]+")) {
//            System.out.println("The Number is Octal Number and the Redix is 8");
//        }
//        else if (str.matches("[0-9]+")) {
//            System.out.println("The Number is Decimal Number and the Redix is 10");
//        }
//        else if (str.matches("[0-9A-F]+")) {
//            System.out.println("The Number is Hexa-Decimal Number and the Redix is 16");
//        }
//        else {
//            System.out.println("The Number is Invalid ");
//        }

//        Ques 2: Find a given Number is a leap year:
        System.out.println("The the Year");
        int year = sc.nextInt();
        if (year%100 == 0){
            if (year%400 == 0){
                System.out.println("year is a leap year");
            }
            else{
                System.out.println("year is not a leap year");
            }
        }
        else{
            if (year%4 == 0){
                System.out.println("year is a leap year");
            }
            else{
                System.out.println("year is not a leap year");
            }
        }
    }
}
