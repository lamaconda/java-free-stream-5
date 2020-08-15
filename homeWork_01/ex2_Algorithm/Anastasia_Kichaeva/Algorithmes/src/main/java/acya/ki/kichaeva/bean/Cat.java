package acya.ki.kichaeva.bean;

public class Cat extends AbstractAnimals{
    public Cat(String kindOfAnimal) {
        super(kindOfAnimal);
    }

    @Override
    public void getPutSomeoneInTheFridge() {
        System.out.println("\n Open the refrigerator;\n put the " + getKindOfAnimal() + " in the refrigerator;\n close the refrigerator.\n");
    }
}
