package com.example.ci_test;

public abstract class shape {
    public String name;
    public shape(String name)
    {
        this.name=name;

    }
    public abstract double area();
    public abstract double perimeter();
}
