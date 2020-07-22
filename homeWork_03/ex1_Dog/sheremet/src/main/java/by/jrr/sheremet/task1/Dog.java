package main.java.by.jrr.sheremet.task1;

public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }
    void voice(){
        System.out.println(name + " is barking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }
}
