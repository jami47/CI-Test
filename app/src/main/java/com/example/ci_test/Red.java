package com.example.ci_test;

public class Red extends Color{
    public Red() {
        super("Red");
    }

    @Override
    public String showcolor() {
        return this.name;
    }
}
