package com.company;
class rectangle{
    private double length;
    private double breadth;
    public rectangle(){
        this.length = 1;
        this.breadth = 1;
    }
    public rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public rectangle(double s){
        this.length = this.breadth = s;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if (length == breadth) return true;
        else return false;
    }
}
public class AB_S11_112_OPPs_Constructors {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(10,7);
        System.out.println(r1.area());
    }
}
