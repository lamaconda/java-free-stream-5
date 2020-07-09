package acya.ki.kichaeva.bean;

public class Parrot extends AbstractAnimals{
    public Parrot(String kindOfAnimal) {
        super(kindOfAnimal);
    }

    @Override
    public void getPutSomeoneInTheFridge() {
        System.out.println("\n Open the refrigerator;\n get a python;\n put the parrot in the refrigerator;\n close the refrigerator.\n");
    }
}
