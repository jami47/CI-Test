package com.example.ci_test;

public class Triangle extends shape{
    public double side1,side2,side3;
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public double area() {
        double s = (side1+side2+side3)/2;
        double ans = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return ans;
    }

    @Override
    public double perimeter() {
        return side3+side1+side2;
    }
}
