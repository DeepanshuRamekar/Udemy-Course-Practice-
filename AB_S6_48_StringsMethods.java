package com.company;

public class AB_S6_48_StringsMethods {
    public static void main(String[] args) {
        String str = new String("netbeans    ");
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(3,5));
        System.out.println(str.replace('e','m'));
        boolean b =str.startsWith("net");
        if (b == true){
            System.out.println("This is a website");
        }
    }
}
