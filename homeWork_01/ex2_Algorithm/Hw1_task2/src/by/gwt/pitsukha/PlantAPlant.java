package by.gwt.pitsukha;

public class PlantAPlant{
    public void run(){
        System.out.println("Алгоритм посадки растения");
        pit();
        drop();
        fill();
        pour();
    }
    public void pit(){
        System.out.println("Шаг 1: Выкопать яму");
    }
    public void drop(){
        System.out.println("Шаг 2: Опусить в яму корень растения");
    }
    public void fill(){
        System.out.println("Шаг 3: Засыпать яму");
    }
    public void pour(){
        System.out.println("Шаг 4: Полить водой \n");
    }
}
