package main.java.by.jrr.sheremet.task3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
