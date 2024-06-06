package com.company;

import java.util.Scanner;

public class AB_S9_83_SC_SecondLargestElemnet_Array {
    public static void main(String[] args) {

//        QUES1:  Finding Sum of All the Element:
        int A[] = {3,9,7,8,12,6,15,5,20,10};
        int sum = 0;
//        ** Method 1:
//        for (int i=0;i<A.length;i++){
//            sum += A[i];
//        }
//        ** Method 2:
        for (int x : A){
            sum += x;
        }
        System.out.println("SUMMATION = "+sum);

//        QUES2:  Searching an Element:
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Element");
//        int key = sc.nextInt();
//        for (int i=0;i<A.length;i++){
//            if (A[i] == key){
//                System.out.println("The index is : "+i);
//                System.exit(0);
//            }
//        }
//        System.out.println("Element Not Found in Array");

//        QUES3:
//        int max = 0;
//        for (int x : A){
//            if (x > max){
//                max = x;
//            }
//        }
//        System.out.println("MAXIMUM Value of Array is : "+max);

//        QUES4:  Find the Second Largest Element:
        int max1 = A[0];
        int max2 = A[0];
        for (int x : A){
            if (x > max1){
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }
        }
        System.out.println("SECOND MAXIMUM Value of Array is : "+max2);
    }
}
