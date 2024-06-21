package com.company;
class Rectangle1{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0){
            this.length = length;
        }
        else {
            this.length = 0;
        }
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
        }
        else{
            this.breadth = 0;
        }
    }

    private double breadth;
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
public class AB_S11_112_OPPs_DataHiding {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.setLength(10);
        r.setBreadth(-10);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());
    }
}
