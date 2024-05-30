package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AB_S6_56_StudentChallengeStringsMethods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to check Binary No., 1 to check Hexa_decimal No. & 2 to check date Format ");
        int x = sc.nextInt();
        if (x == 0){
            System.out.println("Enter the Binary No.");
            String str = sc.next();
            if (str.matches("[01]+")){
                System.out.println("No. is Binary No.");
            }
            else {
                System.out.println("No. is not a Binary No.");
            }
        }
        if (x == 1){
            System.out.println("Enter the Hexa-Decimal No.");
            String str = sc.next();
            if (str.matches("[0-9A-F]+")){
                System.out.println("No. is Hexa-Decimal No.");
            }
            else {
                System.out.println("No. is not a Hexa-Decimal No.");
            }
        }
        if (x == 2){
            System.out.println("Enter The date");
            String str = sc.next();
            if (str.matches("[1-2/3][1-9]/[01][0-9]/[0-9]{4}")){
                System.out.println("Date is in Coorect Format");
            }
            else {
                System.out.println("Date is not in Coorect Format");
            }
        }
    }

}
