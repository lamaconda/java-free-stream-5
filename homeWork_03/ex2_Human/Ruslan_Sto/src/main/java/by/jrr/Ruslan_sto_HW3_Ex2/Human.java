package by.jrr.Ruslan_sto_HW3_Ex2;

public class Human {
    public String name;
    public int age;

    public Human(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void greet (){
            System.out.println("Hi! My name is "+ this.name);
            System.out.println("And I'm "+this.age+" years old.");
        }
    }

