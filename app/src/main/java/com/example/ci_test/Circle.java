package com.example.ci_test;

public class Circle extends shape{
    public double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius=radius;
    }


    @Override
    public double area() {
        return radius*radius*3.1416;
    }

    @Override
    public double perimeter() {
        return 2*3.1416*radius;
    }
}
