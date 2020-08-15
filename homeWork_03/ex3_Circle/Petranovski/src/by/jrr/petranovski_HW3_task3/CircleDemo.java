package by.jrr.petranovski_HW3_task3;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Площадь круга, при радиусе " + circle.radius + " равна " + circle.calculateArea());
        circle.radius = 10;
        System.out.println("Площадь круга, при радиусе " + circle.radius + " равна " + circle.calculateArea());
        circle.radius = 15;
        System.out.println("Площадь круга, при радиусе " + circle.radius + " равна " + circle.calculateArea());
    }
}
