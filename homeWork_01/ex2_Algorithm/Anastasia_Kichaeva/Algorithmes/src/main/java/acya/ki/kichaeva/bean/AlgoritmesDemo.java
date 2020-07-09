package acya.ki.kichaeva.bean;

public class AlgoritmesDemo {
    public static void main(String[] args) {
        Animals[] animals = new Animals[5];
        animals[0] = new Cat("Cat");
        animals[1] = new Dog("Dog");
        animals[2] = new Elephant("Elephant");
        animals[3] = new Giraffe("Giraffe");
        animals[4] = new Parrot("Parrot");

        for (Animals animals1 : animals){
            System.out.println("-How to shove " + animals1.getKindOfAnimal() + " in the fridge:");
            animals1.getPutSomeoneInTheFridge();
        }
    }

}
