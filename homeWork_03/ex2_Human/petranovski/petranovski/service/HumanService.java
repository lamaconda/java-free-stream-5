package by.petranovski.service;

import by.petranovski.bean.Human;

public class HumanService {
    Human human = new Human("Bob Marley", 40);
    public void greet() {
        System.out.println("Hi! My name is " + human.getName() + ", I'm " + human.getAge() + " years old");
    }
}
