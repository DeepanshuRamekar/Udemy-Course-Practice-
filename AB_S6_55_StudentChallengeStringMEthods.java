package com.company;

public class AB_S6_55_StudentChallengeStringMEthods {
    public static void main(String[] args) {
        String str = "deepanshu ramekar22@gmail.com";
        if (str.matches("\\w*.@gmail.*")){
            System.out.println("this is Gmail Account");
            int i = str.indexOf('@');
            int  l = str.length();
            System.out.println("User Name = " +str.substring(0,i));
            System.out.println("User Name = " +str.substring(i+1,l));
        }
        else{
            System.out.println("This is not the Gmail Account");
        }
    }
}
