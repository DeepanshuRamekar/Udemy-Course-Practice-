package com.company;

public class AB_S8_79_SC_Pattern2 {
    public static void main(String[] args) {

//        QUES1:  Pattern4 :
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println();

//        QUES2:  Pattern5 :
        int count = 0;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                ++count;
                System.out.format("%02d  ",count);
            }
            System.out.println();
        }
        System.out.println();

//        QUES3:  Pattern6 :
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//        QUES4:  Pattern7 :
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i+1;j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
