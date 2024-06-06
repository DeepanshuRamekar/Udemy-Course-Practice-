package com.company;

public class AB_S9_88_SC_MatrixMultiplication_2DArray {
    public static void main(String[] args) {

//        QUES1:  Adding 2 Matrix:
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int C[][] = new int[3][3];
//        for (int i=0;i<A.length;i++){
//            for (int j=0;j<A[0].length;j++){
//                C[i][j] = A[i][j] + B[i][j];
//            }
//        }
//        for (int x[] : C ){
//            for (int y : x){
//                System.out.print(y+"  ");
//            }
//            System.out.println();
//        }

//        QUES2:  Multiplication 2 Matrix:
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                C[i][j] = 0;
                for (int k=0;k<3;k++){
                    C[i][j] =  C[i][j] +  A[i][k]*B[k][j];
                }
            }
        }
        for (int x[] : C ){
            for (int y : x){
                System.out.print(y+"  ");
            }
            System.out.println();
        }

//        QUES:  Sorting Array of Strings:
        String arr[] = {"java","python","pascal","smalltalk","ada","basic"};
        java.util.Arrays.sort(arr);
        for (String x : arr){
            System.out.println(x);
        }
    }
}
