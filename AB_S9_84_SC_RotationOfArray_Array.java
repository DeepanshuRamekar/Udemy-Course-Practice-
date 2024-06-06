package com.company;

import java.util.Scanner;

public class AB_S9_84_SC_RotationOfArray_Array {
    public static void main(String[] args) {
//        QUES1:  Rotation of an Array:
//        int A[] = {5,9,6,10,12,7,3,5,4,2};
//        for(int element : A){
//            System.out.print("  "+element);
//        }
//        System.out.println();
//        int temp = A[0];
//        for (int i=1;i<A.length;i++){
//            A[i-1] = A[i];
//        }
//        A[A.length-1] = temp;
//        for(int element : A){
//            System.out.print("  "+element);
//        }

//        QUES2:  Inserting an Element in Array:
//        int A[] = new int[10];
//        A[0] = 5;
//        A[1] = 9;
//        A[2] = 6;
//        A[3] = 10;
//        A[4] = 12;
//        A[5] = 7;
//        int n = 6;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number To be Inserted ");
//        int num = sc.nextInt();
//        System.out.println("Enter the Index");
//        int  index = sc.nextInt();
//        for (int i=n;i>index;i--){
//            A[i+1]= A[i];
//        }
//        A[index] = num;
//        for (int x: A){
//            System.out.print("  "+x);
//        }
//        System.out.println();

//        QUES3:  Deleting An Element:
        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        int n = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index from Where the element is Deleted");
        int index = sc.nextInt();
        for (int i=index;i<n;i++){
            A[i] = A[i+1];
        }
        for (int x : A){
            System.out.print("  "+x);
        }
        System.out.println();
    }
}
