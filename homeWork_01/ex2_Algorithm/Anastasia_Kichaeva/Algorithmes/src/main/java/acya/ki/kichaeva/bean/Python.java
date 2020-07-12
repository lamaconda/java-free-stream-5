package acya.ki.kichaeva.bean;

public class Python extends AbstractAnimals{
    public Python(String kindOfAnimal) {
        super(kindOfAnimal);
    }

    @Override
    public void getPutSomeoneInTheFridge() {
        System.out.println("\n Open the refrigerator;\n get the ferret;\n put the python in the refrigerator\n close the refrigerator.\n");
    }
}
