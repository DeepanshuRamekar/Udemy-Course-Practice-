package com.company;

public class AB_S8_80_SC_Pattern3 {
    public static void main(String[] args) {

//        QUES1:  Pattern8 :
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j>=i){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

//        QUES2:  Pattern9 :
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if ((i+j)>5){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

//        QUES3:  pattern10 :
        

    }
}
