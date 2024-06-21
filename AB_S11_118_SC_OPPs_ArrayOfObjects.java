package com.company;

import java.util.Scanner;

class Subject{
    private String subID;
    private String name;
    private int  maxMarks;
    private int marksObtain;

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    public Subject(String subID, String name) {
        this.subID = subID;
        this.name = name;
    }

    public Subject(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    boolean isQualified(){
        return marksObtain >= maxMarks/10*4;
    }
    public String toString(){
        return "\nSubject ID: "+subID+"\nName: "+name+"\nMarks Obtained: "+marksObtain;
    }
}
public class AB_S11_118_SC_OPPs_ArrayOfObjects {
    public static void main(String[] args) {
        Subject subs [] = new Subject[3];
        subs[0] = new Subject("s101","DS",100);
        subs[1] = new Subject("s102","Algorithms",100);
        subs[2] = new Subject("s103","Operating System",100);

        for (Subject s:subs){
            System.out.println(s);
        }
    }
}
