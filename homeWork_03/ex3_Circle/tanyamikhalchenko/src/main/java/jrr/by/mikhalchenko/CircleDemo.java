package jrr.by.mikhalchenko;

public interface CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double areaResult = circle.calculateArea(2);
        System.out.println("areaResult = " + areaResult);

    }
}


