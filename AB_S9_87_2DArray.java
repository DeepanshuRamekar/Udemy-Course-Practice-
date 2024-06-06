package com.company;

public class AB_S9_87_2DArray {
    public static void main(String[] args) {
//        2D - Array:
        int A[][] = new int [5][5];

        int B[][] = {{1,2,3},{2,4,6},{1,3,5}};
        System.out.println(B.length);
        System.out.println(B[0].length);

//        int C[][];
//        C = new int[5][5];
//
//        int []D[] = new int [5][5];
//
//        int [] E,F[];
////        Here E is a Single Dimension Array because it is simplefied as int[]E;
////        & F is a 2 Dimension Array Because it is Simplefied as int []F[]; .
//        E = new int[5];
//        F = new int[5][5];

//        For loop for Displaying the Element:
        for (int i=0;i<B.length;i++){
            for (int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
//        For-Each Loop for Displaying the Element:
        for (int x[] : B){
            for (int y : x){
                System.out.print(y+"  ");
            }
            System.out.println();
        }

//        Jagged Array :
        int C[][];
        C = new int [3][];
        C[0] = new int[5];
        C[1] = new int[3];
        C[2] = new int[8];
        System.out.println();
        for (int i=0;i<C.length;i++){
            for (int j=0;j<C[i].length;j++){
                System.out.print(C[i][j]+"  ");
            }
            System.out.println();
        }


    }
}
