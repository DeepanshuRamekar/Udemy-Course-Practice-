package com.company;

public class AB_S9_85_SC_IncreasingSizeOfArray_Array {
    public static void main(String[] args) {

//        QUES1:  Copying thr Array:
//        int A[] = {8,6,10,9,2,15,7,13,14,11};
//        int B[] = new int[A.length];
//        for (int i=0;i<A.length;i++){
//            B[i] = A[i];
//        }
//        for (int x : B){
//            System.out.print("  "+x);
//        }

//        QUES2:  Reversing the Array:
//        int A[] = {8,6,10,9,2,15,7,13,14,11};
//        int B[] = new int[A.length];
//        for (int i=0;i<A.length;i++){
//            B[i] = A[A.length-i-1];
//        }
//        for (int x : B){
//            System.out.print("  "+x);
//        }

//        QUES3:  Increasing the Size Of Array:
        int A[] = {8,6,10,9,2};
        System.out.println(A.length);
        int B[] = new int[2* A.length];
        for (int i=0;i<A.length;i++){
            B[i] = A[i];
        }
        A = B;
        B = null;   
        System.out.println(A.length);
    }
}
