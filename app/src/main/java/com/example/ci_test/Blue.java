package com.example.ci_test;

public class Blue extends Color{
    public Blue() {
        super("Blue");
    }

    @Override
    public String showcolor() {
        return this.name;
    }
}
