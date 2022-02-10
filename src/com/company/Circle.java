package com.company;

public class Circle {
    private static  double PI = 3.14 ;
    private static double radius ;

    public Circle() {
    }

    static void area(){
        System.out.println(PI * (radius * radius));

    }

    static void circumference(){
        System.out.println(PI * 2 * radius);

    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
