package com.company;

public class AB_S10_100_varArgs_sc_CalculateDiscount {
    static int max(int...A){
        if (A.length == 0) return Integer.MIN_VALUE;
        int m = 0;
        for (int i=0;i<A.length;i++){
            if (m < A[i]){
                m = A[i];
            }
        }
        return m;
    }

    static int sum(int...A){
        int sum = 0;
        for (int i=0;i<A.length;i++){
            sum += A[i];
        }
        return sum;
    }

    static double discount(double...P){
        double sum = 0;
        for (int i=0;i<P.length;i++){
            sum += P[i];
        }
        if (sum <500) sum = sum - sum*0.1;
        else if (sum > 500 && sum <= 2000) sum = sum - sum*0.2;
        else if (sum > 2000 && sum <= 5000) sum = sum - sum*0.3;
        else sum = sum - sum*0.4;
        return sum;
    }
    public static void main(String[] args) {
//        QUES1:  Maximum of numbers using varargs:
        System.out.println(max(1,25,32,52,45,21,2,3,4));

//        QUES2:  sum of all the elements using varargs:
        System.out.println(sum(1,2,3,4,5,6,7,8,9));

//        QUES3:  calculate the discounts using varargs:
        System.out.println("pay : " +discount(20,100,500,1,20,30,45,35));
    }
}
