package com.company;

import java.util.Scanner;

public class AB_S8_74_SC_Loop_Palindrome {
    public static void main(String[] args) {
//        QUES1:  Find the Reverse Of a Number :
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int num = sc.nextInt();
//        int d;
//        int rev = 0;
//        while (num>0){
//            d = num%10;
//            rev = rev*10+d;
//            num /= 10;
//        }
//        System.out.println("The Reverse of Number = "+rev);

//        QUES2:  Check a Number is Palindrome:
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int num2 = num;
        int d;
        int rev = 0;
        while (num>0){
            d = num%10;
            rev = rev*10+d;
            num /= 10;
        }
        System.out.println("The Reverse of Number = "+rev);
        if (rev == num2){
            System.out.printf("%d is a palindrome Number",num2);
        }
        else {
            System.out.printf("%d is not a palindrome Number",num2);
        }
    }
}
