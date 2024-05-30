package com.company;

public class AB_S6_54_RegularExpression2 {
    public static void main(String[] args) {
//        String str1 = "abc def";
//        System.out.println(str1.matches(".*"));

//        String str1 = "ab6def";
//        System.out.println(str1.matches("[a-z]*"));

//        String str1 = "abcbbccbaaabc";
//        System.out.println(str1.matches("[abc]+"));

//        String str1 = "acc";
//        System.out.println(str1.matches("[abc]{3}"));

//        String str1 = "accbaaab";
//        System.out.println(str1.matches("[abc]{3,7}"));

        String str1 = "deepanshuramekar22@gmail.com";
//        System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail.*"));
    }
}
