package by.gwt.pitsukha;

public class Potato{
    public void run(){
        System.out.println("Процесс жарки картошки");
        take();
        peel();
        pan();
        slice();
        fry();
    }
    public void take(){
        System.out.println("Шаг 1: Взять картошку");
    }
    public void peel(){
        System.out.println("Шаг 2: Почистить картошку");
    }
    public void pan(){
        System.out.println("Шаг 3: Поставить сковороду на огонь");
    }
    public void slice(){
        System.out.println("Шаг 4: Нарезать картошку на сковороду");
    }
    public void fry(){
        System.out.println("Шаг 5: Жарить до готовности \n");
    }
}
