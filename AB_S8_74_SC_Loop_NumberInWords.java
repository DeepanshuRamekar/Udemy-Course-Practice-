package com.company;

import java.util.Scanner;

public class AB_S8_74_SC_Loop_NumberInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int d1,d2;
        String str = "";
        while (num>0){
            d1 = num%10;
            str = str + d1;
            num /= 10;
        }
        char c;
        for (int i=str.length()-1;i>=0;i--){
            c = str.charAt(i);
            switch (c){
                case '0':
                    System.out.print(" Zero");
                    break;
                case '1':
                    System.out.print(" One");
                    break;
                case '2':
                    System.out.print(" Two");
                    break;
                case '3':
                    System.out.print(" Three");
                    break;
                case '4':
                    System.out.print(" Four");
                    break;
                case '5':
                    System.out.print(" Five");
                    break;
                case '6':
                    System.out.print(" Six");
                    break;
                case '7':
                    System.out.print(" Seven");
                    break;
                case '8':
                    System.out.print(" Eight");
                    break;
                case '9':
                    System.out.print(" Nine");
                    break;
                default :
                    System.out.println("Invalid Number");
                    break;
            }
        }
    }
}
