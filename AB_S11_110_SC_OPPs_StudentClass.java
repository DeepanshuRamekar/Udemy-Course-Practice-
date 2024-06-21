package com.company;
class Student{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return (double) total() /3;
    }
    public String grade(){
        if (average() >= 70) return "A";
        else if (average() >=60 && average() <69) return "B";
        else if (average() >=50 && average() <59) return "C";
        else if (average() >=40 && average() <49) return "D";
        else return "F";
    }
    public String  toString(){
        return "Roll.No:" +roll +"\n"+"Name: "+name +"\n"+"course: "+course;
    }
}
public class AB_S11_110_SC_OPPs_StudentClass {
    public static void main(String[] args) {
        Student S = new Student();
        S.roll = 101;
        S.name = "Deepanshu";
        S.course = "Science";
        S.m1 = 95;
        S.m2 = 89;
        S.m3 = 75;
        System.out.printf("%.2f\n",S.average());
        System.out.println(S.grade());
        System.out.println(S);
    }
}
