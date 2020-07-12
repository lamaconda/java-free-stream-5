package acya.ki.kichaeva.bean;

public class Dog extends AbstractAnimals{
    public Dog(String kindOfAnimal) {
        super(kindOfAnimal);
    }

    @Override
    public void getPutSomeoneInTheFridge() {
        System.out.println("\n Open the refrigerator;\n get the cat;\n put the dog in the refrigerator\n close the refrigerator.\n");
    }
}
