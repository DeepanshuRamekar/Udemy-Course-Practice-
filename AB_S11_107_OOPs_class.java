package com.company;
class Circle
{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Rectangle{
    public double length;
    public double breadth;
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

class Cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double Circumference(){
        return 2*Math.PI*radius;
    }
    public double totalSurfaceArea(){
        return (2*lidArea())+(Circumference()*height);
    }
    public double Volume(){
        return lidArea()*height;
    }
}
public class AB_S11_107_OOPs_class {
    public static void main(String[] args) {
//        Circle:-
        Circle c1 = new Circle();
        c1.radius = 7;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());

        Circle c2 = new Circle();
        c2.radius = 14;
        System.out.println(c2.area());
        System.out.println(c2.perimeter());
        System.out.println(c2.circumference());

//        Rectangle:-
        Rectangle R = new Rectangle();
        R.length = 10.5;
        R.breadth = 10.5;
        System.out.println(R.area());
        System.out.println(R.perimeter());
        System.out.println(R.isSquare());

//        Cylinder:-
        Cylinder C = new Cylinder();
        C.radius = 7;
        C.height = 10;
        System.out.println(C.lidArea());
        System.out.println(C.Circumference());
        System.out.println(C.totalSurfaceArea());
        System.out.println(C.Volume());
    }

}
