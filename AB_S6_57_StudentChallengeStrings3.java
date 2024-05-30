package com.company;

import java.sql.SQLOutput;

public class AB_S6_57_StudentChallengeStrings3 {
        public static void main(String[] args) {
        String str = "     a!   B@          c#1 $2 %  3     ";
        System.out.println(str.replaceAll("[^a-zA-Z0-9 ]", ""));

        System.out.println(str.replaceAll("\\s+", " ").trim());

        String str2 = "    abc   de  fgh   ijk     ";
        str2 = str2.replaceAll("\\s"," ").trim();
        String Words [] = str2.split("\\s");
        System.out.println(Words.length);
    }
}
