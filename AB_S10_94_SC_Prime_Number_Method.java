package com.company;

public class AB_S10_94_SC_Prime_Number_Method {
    static void isPrime(int n){
        for (int i=2;i<=n/2;i++){
            if (n%i == 0){
                System.out.println("The Number is not a Prime Number");
                System.exit(0);
            }
        }
        System.out.println("The Number is a prime Number");
    }

    static int gcd(int m,int n){
        while(m!=n){
            if(m>n) m=m-n;
            else n=n-m;
        }
        return n;
    }

    static int max(int A[]){
        int max = 0;
        for (int x : A){
            if (x > max){
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        QUES1:  Find a Number is Prime:
        isPrime(19);

//        QUES2:  Find the Greatest Common Multiple:
        System.out.println(gcd(35,56));

//        QUES3:  Find the Max Element in an Array:
        int B[] = {8,3,15,9,7};
        System.out.println(max(B));
    }
}
