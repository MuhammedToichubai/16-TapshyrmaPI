package com.company;

public class Main {

    public static void main(String[] args) {
//        Circle деген класс тузунуз, анын PI деген свойствасы, area
//        жана circumference деген статик методдору болсун.
//        areaны табуу учун: PI * (radius * radius)
//        circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат

    Circle circle = new Circle();
    circle.setRadius(2.97);
        System.out.println("PI = "+circle.getPI()+"\nRadius = "+circle.getRadius());
        System.out.print("Area = "+circle.getPI()+" * "+"("+circle.getRadius()+" * "+circle.getRadius()+")"+" = ");
        Circle.area();
        System.out.print("Circumference = "+circle.getPI()+" * 2 * "+circle.getRadius()+" = ");
        Circle.circumference();

    }
}
