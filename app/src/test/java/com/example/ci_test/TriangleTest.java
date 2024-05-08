package com.example.ci_test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void area() {
        Triangle triangle = new Triangle(3,4,5);
        assertEquals(6,triangle.area(),0.0);
    }

    @Test
    public void perimeter() {
        Triangle triangle = new Triangle(3,4,5);
        assertEquals(12,triangle.perimeter(),0.0);

    }
}