package com.company;

public class AB_S6_52_StringsMethods3 {
    public static void main(String[] args) {
        String str1 = "pyramid"; // This is created in Pool
        String str2 = new String("Pyramid"); // This is created in Heap
        // Here the Objects (Pyramid is an objects) or contains are compare
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        // Here the references (str1 & str2) are compared
        System.out.println(str1==str2);
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.contains("pyr"));
        System.out.println(str1.concat(str2));
        System.out.println(str1+str2);

        

    }
}
