package com.company;

public class AB_S7_65_SwitchCase {
    public static void main(String[] args) {
//        int n=3;
//        if (n==1){
//            System.out.println("One");
//        }
//        else if (n==2) {
//            System.out.println("Two");
//        }
//        else if (n==3) {
//            System.out.println("Three");
//        }
//        else {
//            System.out.println("Not Valid");
//        }
        int n=3;
        switch(n){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default :
                System.out.println("Invalid no.");
        }

        String str = "1";
        switch(str){
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            case "3":
                System.out.println("Three");
                break;
            default :
                System.out.println("Invalid no.");
        }

    }
}
