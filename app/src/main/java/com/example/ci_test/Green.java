package com.example.ci_test;

public class Green extends Color{
    public Green() {
        super("Green");
    }

    @Override
    public String showcolor() {
        return this.name;
    }
}
