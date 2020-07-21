package jrr.by.mikhalchenko;

public class Circle {
    public double radius;

    public double calculateArea(double radius) {
        this.radius = radius;
        double result = Math.PI * radius * radius;
        return result;
    }
}

