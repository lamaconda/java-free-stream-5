package jrr.by.mikhalcheno;

public class Human {
    public String name;
    public int age;

    public Human() {
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void  greet() {
        System.out.println("Hi! My name is " + this.name + ", I'm " + this.age + " years old.");
    }
}

