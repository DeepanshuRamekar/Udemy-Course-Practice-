package com.company;

public class AB_S10_99_VarialbleArguments {
    static void show(int...A){
        for (int x:A){
            System.out.println(x);
        }
    }
    static void showList(int start, String...S){
        for (int i=0;i<S.length;i++){
//            System.out.println(i+1 +" " +S[i]);
            System.out.println(start +" " +S[i]);
            start++;
        }
    }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int [] {3,5,7,9,11,13,15}); // varargs will support the array element also

        showList(5,"Sanchit","Rekha","vikas","Ajay");
    }
}
