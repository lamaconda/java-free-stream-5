package main.java.by.jrr.sheremet.task2;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    void greet(){
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
    }
}
