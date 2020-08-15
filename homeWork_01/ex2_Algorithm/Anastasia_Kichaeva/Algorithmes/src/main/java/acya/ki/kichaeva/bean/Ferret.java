package acya.ki.kichaeva.bean;

public class Ferret extends AbstractAnimals {
    public Ferret(String kindOfAnimal) {
        super(kindOfAnimal);
    }

    @Override
    public void getPutSomeoneInTheFridge() {
        System.out.println("\n Open the refrigerator;\n get the dog;\n put the ferret in the refrigerator\n close the refrigerator.\n");
    }
}
