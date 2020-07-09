package acya.ki.kichaeva.bean;

public class Giraffe extends AbstractAnimals {
    public Giraffe(String kindOfAnimal) {
        super(kindOfAnimal);
    }

    @Override
    public void getPutSomeoneInTheFridge() {
        System.out.println("\n Open the refrigerator;\n get a elephant;\n put the giraffe in the refrigerator;\n close the refrigerator.\n");
    }
}
