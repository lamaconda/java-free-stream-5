package acya.ki.kichaeva.bean;

public class Elephant extends AbstractAnimals{
    public Elephant(String kindOfAnimal) {
        super(kindOfAnimal);
    }

    @Override
    public void getPutSomeoneInTheFridge() {
        System.out.println("\n Open the refrigerator;\n get a dog;\n put the elephant in the refrigerator;\n close the refrigerator.\n");
    }
}
