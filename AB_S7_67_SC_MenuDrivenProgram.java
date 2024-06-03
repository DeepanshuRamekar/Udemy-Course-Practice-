package com.company;

import java.util.Scanner;

public class AB_S7_67_SC_MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" MENU:-");
        System.out.println("========");
        System.out.println("*ADD");
        System.out.println("*SUB");
        System.out.println("*MUL");
        System.out.println("*DIV");
        System.out.println("Enter 2 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the Option from MENU in Words");
        String str = sc.next();
        str = str.toUpperCase();
        switch (str){
            case "ADD":
                System.out.println("sunm is : "+(a+b));
                break;
            case "SUB":
                System.out.println("Difference is : "+(a-b));
                break;
            case "MUL":
                System.out.println("Multiplication is : "+(a*b));
                break;
            case "DIV":
                System.out.println("Division is : "+(float)(a/b));
                break;
            default:
                System.out.println("invalid Option Select");
                break;
        }
    }
}
