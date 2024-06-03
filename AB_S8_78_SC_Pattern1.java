package com.company;

public class AB_S8_78_SC_Pattern1 {
    public static void main(String[] args) {
//        QUES1:  Pattern1 :
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println();

//        QUES2:  Pattern2:
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print((i+j)+"  ");
            }
            System.out.println();
        }
        System.out.println();

//        QUES3:  Pattern3 :
        int count = 0;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                count++;
                System.out.format("%02d  ",count);
            }
            System.out.println();
        }

    }
}
