package com.company;

import java.sql.SQLOutput;

public class AB_S10_92_Methods_Object_passing {
    static void change(int X[], int index,int value){
        X[index] = value;
    }
    static void change2(int x,int value){
        x = value;
    }
    public static void main(String[] args) {
        int A[] = {2,4,6,8,10};
        change(A,2,20);
        for(int x : A){
            System.out.println(x);
        }
        int x = 10;
        change2(x,20);
        System.out.println("Value of primative  "+x );
    }
}
