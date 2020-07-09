package ex1_Dog.Dmitry_Karachun;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog(3, "black", "Jack");
        System.out.println(dog1);
        dog1.eat();
        dog1.voice();
        dog1.sleep();

        Dog dog2 = new Dog();
        dog2.setName("Jimmy");
        dog2.setColor("white");
        dog2.setAge(1);

        System.out.println(dog2);
        dog2.eat();
        dog2.voice();
        dog2.sleep();
    }
}
