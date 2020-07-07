package by.gwt.pitsukha;

public class Milk{
    public void run(){
        System.out.println("Алгоритм покупки молока");
        shop();
        rack();
        choice();
        boxOffice();
        pay();
    }
    public void shop(){
        System.out.println("Шаг 1: Зайти в магазин");
    }
    public void rack(){
        System.out.println("Шаг 2: Подойти к стеллажу с молоком");
    }
    public void choice(){
        System.out.println("Шаг 3: Выбрать молоко");
    }
    public void boxOffice(){
        System.out.println("Шаг 4: Отнести на кассу");
    }
    public void pay(){
        System.out.println("Шаг 5: Оплатить \n");
    }
}
