package com.company;

public class AB_S10_97_SC_OverloadValidateMethod {
//    QUES:2
    static int area(int l,int b){
        return l*b;
    }
    static float area(float r){
        return (2f*(float)Math.PI*r*r);
    }
//    QUES:2
    static int reverse(int num){
        int rev = 0;
        int d;
        while (num > 0){
            d= num % 10;
            rev = rev*10+d;
            num /= 10;
        }
        return rev;
    }
    static int [] reverse(int a[]){
        int b[] = new int[a.length];
        for (int i=a.length-1,j=0;i>=0;i--,j--){
            b[j] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
//        QUES1: OverLoad method to calculate area
//        System.out.println(area(10,10));
//        System.out.println(area(10));

//        QUES2: Method to reverse the int and array:
        System.out.println(reverse(732));
        int a[] = {1,2,3,4,5,6};
        System.out.println(a);
    }
}
