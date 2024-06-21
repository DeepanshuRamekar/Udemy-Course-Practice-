package com.company;

public class AB_S10_90_Methods {
    static void inc(int x){
        x++;
        System.out.println(x);
    }
    static int max(int x,int y){
        if (x>y){
            return x;
        }
        else {
            return y;
        }
    }
    public static void main(String[] args) {
        int a=10, b=15;
//        1). This method can be called if the method is static.
        System.out.println(max(a,b));

//        2). if you want to call the method without the method to be  static
//        AB_S10_90_Methods mp = new AB_S10_90_Methods();
//        System.out.println(mp.max(a,b));

        inc(a);
        System.out.println(a);
    }
}
