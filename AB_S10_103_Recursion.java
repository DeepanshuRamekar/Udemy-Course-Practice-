package com.company;

public class AB_S10_103_Recursion {
//    static void fun(int n){
//        if(n>0){
//            System.out.println(n);
//            fun(n-1);
//        }
//    }
static void fun(int n){
    if(n>0){
        fun(n-1);
        System.out.println(n);
    }
}
    public static void main(String[] args) {
        fun(3);
    }
}
