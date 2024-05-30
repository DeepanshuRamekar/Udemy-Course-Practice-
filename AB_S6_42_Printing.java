package com.company;

public class AB_S6_42_Printing {
    public static void main(String[] args) {
//        int x=10,y=20;
//        int a=10;
//        float b=12.55f;
//        char c='A';
//        String str = "Hello";
//
//        System.out.println(x+y +" Sum");
//        System.out.println("Number is " +y);
//        System.out.println("Sum " +(x+y));
//        System.out.println("Sum of " +x +" and " +y +" is " +(x+y));

        int x=10;
        float y=12.56f;
        char z='A';
        String str = "Java Program";

        System.out.printf("Hello %d %f %c \n",x,y,z);
        System.out.printf("Hello %o \n",x);
        System.out.printf("Hello %x \n",x);

        System.out.printf("Hello %e \n",y);
        System.out.printf("Hello %g \n",y);

        System.out.printf("Hello %s \n",str);

        System.out.printf("%1$d %2$f %3$s",x,y,str);

        int a=-10;
        float b=3.45f;
//        String str="Java";

        System.out.printf("%d\n",a);
        System.out.printf("%5d\n",a);
        System.out.printf("%05d\n",a);
        System.out.printf("%(5d\n",a);
        System.out.printf("%+5d\n",a);

        System.out.printf("%06.2f\n",b);
//        System.out.printf("%20s",str);
//        System.out.printf("%-20s",str);
//        System.out.format("%-20s",str);
//        System.out.printf("bvdyvdf");
    }
}
