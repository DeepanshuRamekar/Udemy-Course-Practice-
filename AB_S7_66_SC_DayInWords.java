package com.company;

import java.util.Scanner;

public class AB_S7_66_SC_DayInWords {
    public static void main(String[] args) {

//        QUES:1  Display Nuumber of day Based on Number:
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter Day Number");
//        int day = sc.nextInt();
//
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default :
//                System.out.println("Invalid day");
//        }

//        QUES:2  Display Name of Month Based on Number from User:
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter Month Number");
//        int month = sc.nextInt();
//
//        switch(month){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("Auguast");
//                break;
//            case 9:
//                System.out.println("Suptember");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default :
//                System.out.println("Invalid Month");
//                break;
//        }

//        QUES:3  Display Type of Website:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Website URL");
        String Domain = sc.nextLine();
        String ext = Domain.substring(Domain.lastIndexOf('.')+1);

        switch (ext){
            case "com":
                System.out.println("Commercial Website");
                break;
            case "org":
                System.out.println("Organizational Website");
                break;
            case "net":
                System.out.println("Network Website");
                break;
            case "gov":
                System.out.println("Government Website");
                break;
            default :
                System.out.println("Invalid Website");
        }


    }
}
