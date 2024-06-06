package com.company;

public class AB_S9_82_1DArrays {
    public static void main(String[] args) {
//        Creating and Array:
        int A[] = new int[10];
        int B[] = {1,2,3,4,5};
        int C[];
        C = new int[10];
//        Accessing an Array:
//        B[2] = 15;

//        for (int i=0;i<B.length;i++){
//            System.out.println(B[i]);
//        }

//        For Each-Loop:
//        for (int element : B){
//            System.out.println(element);
//        }

        for (int i=0;i<B.length;i++){
            System.out.println(++B[i]);
        }
        System.out.println(B.length);


    }
}
