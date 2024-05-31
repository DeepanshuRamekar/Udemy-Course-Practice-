package com.company;

import java.util.Scanner;

public class AB_S7_63_StudentChallenge_CS {
    public static void main(String[] args) {

//        ques 1: Display Name of a day Based on number:
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Day");
//        int day = sc.nextInt();
//        if (day==1){
//            System.out.println("Monday");
//        }
//        else if (day==2) {
//            System.out.println("Tuesday");
//        }
//        else if (day==3) {
//            System.out.println("wednesday");
//        }
//        else if (day==4) {
//            System.out.println("Thrusday");
//        }
//        else if (day==5) {
//            System.out.println("Friday");
//        }
//        else if (day==6) {
//            System.out.println("Saturday");
//        }
//        else if (day==7) {
//            System.out.println("Sunday");
//        }
//        else {
//            System.out.println("Error");
//        }

//        Ques 2 : Find Type of Website and protocal used:
        System.out.println("Enter the URL of Website");
        String url = sc.next();
        int i1 = url.indexOf('.');
        int i2 = url.indexOf(':');
        int l = url.length();
        System.out.println(url.substring(0,i2));
        System.out.println(url.substring(i1+1,l));
        if (url.substring(0, i2).equals("http")){
            System.out.println("The protocol is 'Hyper Text Transfer Protocol'");
        }
        else if (url.substring(0, i2).equals("ftp")) {
            System.out.println("The protocol is 'File Transfer Protocol'");
        }
        else {
            System.out.println("Invalid Format");
        }

        if (url.substring(i1+1, l).equals("com")){
            System.out.println("The Website is Commercial Website");
        }
        else if (url.substring(i1+1, l).equals("org")) {
            System.out.println("The Website is Organization Website");
        }
        else if (url.substring(i1+1, l).equals("net")) {
            System.out.println("The Website is Network Website");
        }
        else {
            System.out.println("Invalid Format");
        }
    }
}
