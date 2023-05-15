package org.example;
import static java.lang.Math.PI;

public class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double pi = 3.14;
        return pi * (Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        double pi = 3.14;
        return 2 * pi * radius;
    }
}
